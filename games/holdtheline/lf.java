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
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (null == ((lf) this).field_c) {
            break L0;
          } else {
            if (((lf) this).field_c.length == 0) {
              break L0;
            } else {
              L1: {
                if (param1 == 1800174305) {
                  break L1;
                } else {
                  int discarded$2 = ((lf) this).a((byte) -113);
                  break L1;
                }
              }
              var3 = 1;
              L2: while (true) {
                if (var3 >= ((lf) this).field_c.length) {
                  return -1 + ((lf) this).field_c.length;
                } else {
                  if (param0 >= ((lf) this).field_c[var3] + ((lf) this).field_c[-1 + var3] >> 1) {
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
        RuntimeException var7 = null;
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
        qm var47 = null;
        qm var48 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
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
                field_d = null;
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
                      var45_ref = (dd) (Object) var14;
                      param3.a((Object) (Object) new lb(var12, var45_ref.field_P, var45_ref.field_k, true, true), (byte) 6);
                      var12 = var45_ref.field_P;
                      if (var45_ref.field_N == var45_ref.field_O) {
                        param2.a((Object) (Object) new lb(var8, var45_ref.h(7560980), var45_ref.field_k, var45_ref.field_w, var45_ref.field_t), (byte) 6);
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
                            param2.a((Object) (Object) new lb(var19, var46, var45_ref.field_k, var45_ref.field_w, var45_ref.field_t), (byte) 6);
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
                            param5.a((Object) (Object) new lb(var19, var47, var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
                            var18 = var18 + var17;
                            var19 = var47;
                            var20++;
                            continue L7;
                          }
                        }
                      } else {
                        param5.a((Object) (Object) new lb(var9, var45_ref.l(8421504), var45_ref.field_k, var45_ref.field_m, var45_ref.field_t), (byte) 6);
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
                            param0.a((Object) (Object) new lb(var19, var48, var45_ref.field_k, var45_ref.field_s, var45_ref.field_q), (byte) 6);
                            var18 = var18 + var17;
                            var19 = var48;
                            var20++;
                            continue L9;
                          }
                        }
                      } else {
                        param0.a((Object) (Object) new lb(var10, var45_ref.a((byte) 29), var45_ref.field_k, var45_ref.field_s, var45_ref.field_q), (byte) 6);
                        var10 = var45_ref.a((byte) 29);
                        break L8;
                      }
                    }
                    if (var45_ref.field_z == var45_ref.field_A) {
                      param1.a((Object) (Object) new lb(var11, var45_ref.m(-14), var45_ref.field_k, var45_ref.field_x, var45_ref.field_q), (byte) 6);
                      var11 = var45_ref.m(-14);
                      break L3;
                    } else {
                      L10: {
                        var16 = (int)(var45_ref.f(50) / 5.0f) + 1;
                        var17 = 1.0f / (float)var16;
                        var18 = var17;
                        var19 = var11;
                        var20 = 1;
                        if (var16 <= var20) {
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var13++;
                      continue L2;
                    }
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
                    L11: while (true) {
                      if (var26 >= -1 + var18_int) {
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
                        break L3;
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
            stackOut_32_0 = (RuntimeException) var7;
            stackOut_32_1 = new StringBuilder().append("lf.C(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          L13: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L13;
            }
          }
          L14: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L14;
            }
          }
          L15: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L15;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L15;
            }
          }
          L16: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param4 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L16;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L16;
            }
          }
          L17: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param5 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L17;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L17;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param6 + ')');
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
