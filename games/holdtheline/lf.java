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
        int var3;
        int var4;
        L0: {
          var4 = HoldTheLine.field_D;
          if (null == this.field_c) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              L1: {
                if (param1 == 1800174305) {
                  break L1;
                } else {
                  this.a((byte) -113);
                  break L1;
                }
              }
              var3 = 1;
              L2: while (true) {
                if (var3 >= this.field_c.length) {
                  return -1 + this.field_c.length;
                } else {
                  if (param0 >= this.field_c[var3] + this.field_c[-1 + var3] >> 1800174305) {
                    var3++;
                    continue L2;
                  } else {
                    return var3 - 1;
                  }
                }
              }
            }
          }
        }
        return 0;
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
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        qm var47 = null;
        qm var48 = null;
        qm var49 = null;
        var34 = null;
        var45 = null;
        var32 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var33 = param4[param4.length - 1];
              var8 = var33.h(7560980);
              var9 = var33.l(8421504);
              var10 = var33.a((byte) 29);
              var11 = var33.m(-14);
              var12 = var33.a(0);
              if (param6 <= -33) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var13 = 0;
            L2: while (true) {
              if (param4.length <= var13) {
                break L0;
              } else {
                L3: {
                  var14 = param4[var13];
                  if (var14 instanceof dd) {
                    L4: {
                      var45_ref = (dd) ((Object) var14);
                      param3.a(new lb(var12, var45_ref.field_P, var45_ref.field_k, true, true), (byte) 6);
                      var12 = var45_ref.field_P;
                      if (var45_ref.field_N == var45_ref.field_O) {
                        param2.a(new lb(var8, var45_ref.h(7560980), var45_ref.field_k, var45_ref.field_w, var45_ref.field_t), (byte) 6);
                        var8 = var45_ref.h(7560980);
                        break L4;
                      } else {
                        var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                        var17 = 1.0f / (float)var16;
                        var18 = var17;
                        var19 = var8;
                        var20 = 1;
                        L5: while (true) {
                          if (var16 <= var20) {
                            break L4;
                          } else {
                            var46 = var45_ref.a(var18, 255);
                            var8 = var46;
                            param2.a(new lb(var19, var46, var45_ref.field_k, var45_ref.field_w, var45_ref.field_t), (byte) 6);
                            var18 = var18 + var17;
                            var19 = var46;
                            var20++;
                            continue L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (var45_ref.field_L != var45_ref.field_K) {
                        var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                        var17 = 1.0f / (float)var16;
                        var18 = var17;
                        var19 = var9;
                        var20 = 1;
                        L7: while (true) {
                          if (var16 <= var20) {
                            break L6;
                          } else {
                            var47 = var45_ref.c(var18, 124);
                            param5.a(new lb(var19, var47, var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
                            var18 = var18 + var17;
                            var19 = var47;
                            var20++;
                            continue L7;
                          }
                        }
                      } else {
                        param5.a(new lb(var9, var45_ref.l(8421504), var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
                        var9 = var45_ref.l(8421504);
                        break L6;
                      }
                    }
                    L8: {
                      if (var45_ref.field_C != var45_ref.field_I) {
                        var16 = 1 + (int)(var45_ref.f(50) / 5.0f);
                        var17 = 1.0f / (float)var16;
                        var18 = var17;
                        var19 = var10;
                        var20 = 1;
                        L9: while (true) {
                          if (var16 <= var20) {
                            break L8;
                          } else {
                            var48 = var45_ref.a(var18, false);
                            param0.a(new lb(var19, var48, var45_ref.field_k, var45_ref.field_s, var45_ref.field_q), (byte) 6);
                            var18 = var18 + var17;
                            var19 = var48;
                            var20++;
                            continue L9;
                          }
                        }
                      } else {
                        param0.a(new lb(var10, var45_ref.a((byte) 29), var45_ref.field_k, var45_ref.field_s, var45_ref.field_q), (byte) 6);
                        var10 = var45_ref.a((byte) 29);
                        break L8;
                      }
                    }
                    if (var45_ref.field_z == var45_ref.field_A) {
                      param1.a(new lb(var11, var45_ref.m(-14), var45_ref.field_k, var45_ref.field_x, var45_ref.field_q), (byte) 6);
                      var11 = var45_ref.m(-14);
                      break L3;
                    } else {
                      var16 = (int)(var45_ref.f(50) / 5.0f) + 1;
                      var17 = 1.0f / (float)var16;
                      var18 = var17;
                      var19 = var11;
                      var20 = 1;
                      L10: while (true) {
                        if (var16 > var20) {
                          var49 = var45_ref.a(-851, var18);
                          var11 = var49;
                          param1.a(new lb(var19, var49, var45_ref.field_k, var45_ref.field_x, var45_ref.field_q), (byte) 6);
                          var18 = var18 + var17;
                          var19 = var49;
                          var20++;
                          continue L10;
                        } else {
                          var13++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var34_ref = (hn) ((Object) var14);
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
                    L11: while (true) {
                      if (var26 >= -1 + var18_int) {
                        var40 = new lb(var21, var34_ref.h(7560980), var34_ref.field_k, var34_ref.field_w, var34_ref.field_t);
                        param2.a(var40, (byte) 6);
                        var41 = new lb(var22, var34_ref.l(8421504), var34_ref.field_k, var34_ref.field_m, var34_ref.field_t);
                        param5.a(var41, (byte) 6);
                        var42 = new lb(var23, var34_ref.a((byte) 29), var34_ref.field_k, var34_ref.field_s, var34_ref.field_q);
                        param0.a(var42, (byte) 6);
                        var43 = new lb(var24, var34_ref.m(-14), var34_ref.field_k, var34_ref.field_x, var34_ref.field_q);
                        param1.a(var43, (byte) 6);
                        var44 = new lb(var25, var34_ref.a(0), var34_ref.field_k, true, true);
                        param3.a(var44, (byte) 6);
                        var8 = var34_ref.h(7560980);
                        var9 = var34_ref.l(8421504);
                        var10 = var34_ref.a((byte) 29);
                        var11 = var34_ref.m(-14);
                        var12 = var34_ref.a(0);
                        break L3;
                      } else {
                        var27 = var34_ref.a(var20_float, 255);
                        var28 = var34_ref.a(var20_float, false);
                        var29 = var34_ref.c(var20_float, 105);
                        var30 = var34_ref.a(-851, var20_float);
                        var31 = var34_ref.a(false, var20_float);
                        var35 = new lb(var21, var27, var34_ref.field_k, var34_ref.field_w, var34_ref.field_t);
                        var20_float = var20_float + var19_float;
                        param2.a(var35, (byte) 6);
                        var36 = new lb(var22, var29, var34_ref.field_k, var34_ref.field_m, var34_ref.field_t);
                        param5.a(var36, (byte) 6);
                        var37 = new lb(var23, var28, var34_ref.field_k, var34_ref.field_s, var34_ref.field_q);
                        param0.a(var37, (byte) 6);
                        var38 = new lb(var24, var30, var34_ref.field_k, var34_ref.field_x, var34_ref.field_q);
                        param1.a(var38, (byte) 6);
                        var39 = new lb(var25, var31, var34_ref.field_k, true, true);
                        var22 = var29;
                        var23 = var28;
                        var25 = var31;
                        var21 = var27;
                        var24 = var30;
                        param3.a(var39, (byte) 6);
                        var26++;
                        continue L11;
                      }
                    }
                  }
                }
                var13++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var7);

            stackIn_35_1 = new StringBuilder().append("lf.C(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param3 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L15;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L16;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

            if (param5 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L17;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L17;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_36_0), stackIn_51_2 + ',' + param6 + ')');
        }
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 == -100) {
          L0: {
            L1: {
              if (this.field_c == null) {
                break L1;
              } else {
                if (0 != this.field_c.length) {
                  stackIn_7_0 = this.field_c[-1 + this.field_c.length];
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 0;
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
        this.field_c = new int[param2 - -1];
        this.field_h = param0;
        this.field_k = param1;
    }

    static {
        field_b = new e(4, 1, 1, 1);
        field_f = new String[]{null, "<col=2>You must win the Classic championship to unlock.</col>", "<col=2>You must win the Desert championship to unlock.</col>", "<col=2>You must win the Alpine championship to unlock.</col>"};
        field_g = 64;
        field_d = "Dune Buggy";
        field_i = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_j = new String[]{"Complete all Championships", "Complete all Championships, with a total time less than 36 minutes, 30 seconds", "Complete all Classic courses,<br>with a total time less than<br>7 minutes, 30 seconds", "Complete all Alpine courses,<br>with a total time less than<br>9 minutes, 40 seconds", "Complete all Desert courses,<br>with a total time less than<br>10 minutes, 10 seconds", "Complete all Night courses, with a total time less than<br>11 minutes, 20 seconds", "Complete three consecutive laps without hitting a wall on any Desert, Alpine or Night course", "Complete three consecutive laps without leaving the track on any Desert, Alpine or Night course", "Win a race, collecting<br>only red powerups", "Win a race, collecting<br>only green powerups", "Win a race, collecting<br>only blue powerups", "Win a race, collecting<br>no powerups", "Win a race, having been in last place when entering the final lap", "Hit three opponents with one missile", "Gain a two-lap lead over your closest competitor", "Win a Demolition match during Hallowe'en by killing 500 zombies... again"};
    }
}
