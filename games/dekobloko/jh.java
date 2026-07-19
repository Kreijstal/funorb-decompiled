/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String[] field_c;
    static java.awt.Canvas field_b;
    static int field_e;
    static String field_g;
    static String field_f;
    static ck field_d;
    static String field_a;
    static boolean field_h;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0) {
          field_d = (ck) null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static java.awt.Frame a(int param0, fd param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException var6 = null;
        dc[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        dc[] var10 = null;
        mh var11 = null;
        Object stackIn_7_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_35_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1.b(-86)) {
              L1: {
                if (param3 != 0) {
                  break L1;
                } else {
                  var10 = ak.a((byte) -109, param1);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var10.length) {
                            break L4;
                          } else {
                            stackOut_10_0 = param2 ^ -1;
                            stackIn_22_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_11_0 != (var10[var8].field_f ^ -1)) {
                                  break L5;
                                } else {
                                  if (param0 != var10[var8].field_j) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (-1 == (param5 ^ -1)) {
                                        break L6;
                                      } else {
                                        if (var10[var8].field_a != param5) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (var10[var8].field_h > param3) {
                                          break L7;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    var7_int = 1;
                                    param3 = var10[var8].field_h;
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_21_0 = var7_int;
                        stackIn_22_0 = stackOut_21_0;
                        break L3;
                      }
                      if (stackIn_22_0 != 0) {
                        break L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L8: {
                if (!param4) {
                  break L8;
                } else {
                  field_h = true;
                  break L8;
                }
              }
              var11 = param1.a((byte) 107, param0, param3, param2, param5);
              L9: while (true) {
                L10: {
                  if (0 != var11.field_c) {
                    break L10;
                  } else {
                    ua.a(10L, -128);
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var7 = (java.awt.Frame) (var11.field_b);
                if (var7 != null) {
                  if ((var11.field_c ^ -1) == -3) {
                    wj.a(true, var7, param1);
                    stackOut_35_0 = null;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return var7;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("jh.D(").append(param0).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_7_0);
        } else {
          return (java.awt.Frame) ((Object) stackIn_36_0);
        }
    }

    final static void a(byte param0, mm param1, ji param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ac var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        mm var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = kd.field_p;
            ie.field_c = new w(0L, (w) null);
            if (param2 == null) {
              var10 = (Throwable) null;
              qb.a((Throwable) null, 16408, "QC1");
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param2.field_b = false;
              param2.field_g = 0;
              oi.field_a = new em(var3_int, param2, param2);
              wj.field_Qb = new sm(var3_int, param2, param2, new ga());
              var4 = dn.b((byte) 124);
              if (var4 == null) {
                var11 = (Throwable) null;
                qb.a((Throwable) null, 16408, "QC2");
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                jc.a(var4, -1);
                var12 = (mm) null;
                fj.field_d = wa.a(2245737, 1513239, 0, 8947848, 5138823, 1127256, 65793, 65793, 4020342, 1513239, 65793, -24447, (mm) null);
                rd.field_e = wa.a(0, 0, 16764006, 0, 0, 0, 0, 0, 0, 0, 0, -24447, param1);
                ad.field_q = wa.a(0, 0, 16777215, 0, 0, 0, 0, 0, 0, 0, 0, -24447, param1);
                var5 = hk.field_j;
                var6 = hk.field_i;
                var16 = hk.field_l;
                qb.field_q = new ck(10, 14);
                qb.field_q.a();
                var8 = 2;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (-8 >= (var8 ^ -1)) {
                        break L3;
                      } else {
                        hk.g(var8, var8 - -1, 14 - (var8 << -810284479), 16777215);
                        var8++;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    hk.a(var16, var5, var6);
                    vk.field_a = ll.a(ad.field_q, rd.field_e, var4, fj.field_d, 0);
                    break L2;
                  }
                  if (param0 > 61) {
                    ie.field_c.field_M = new vj();
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int a(int[] param0, int param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var3) {
                    break L3;
                  } else {
                    var2_int = var2_int + h.a(param0[var3], -127);
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 >= 94) {
                  break L2;
                } else {
                  var5 = (int[]) null;
                  discarded$2 = jh.a((int[]) null, 120);
                  break L2;
                }
              }
              stackOut_8_0 = var2_int;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("jh.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_c = new String[]{"Form a Deko and a Bloko at precisely the same time", "Eliminate a wildcard as part of 2 shapes at the same time", "Eliminate a wildcard as part of 3 shapes at the same time", "Eliminate a wildcard as part of 7 shapes at the same time", "Double-eliminate a solid shape by completing 2 touching loose shapes at the same time", "Triple-eliminate a solid shape by completing 3 touching loose shapes at the same time", "Set off a chain of 5 explosions", "Set off a chain of 10 explosions", "Make a solid shape as tall as the bucket", "Bombard your victim with 100 shapes in one go in a multiplayer game", "Completely clear a quarter-full bucket in a Rated game", "Have over 30 shapes in your machine in a Rated game", "Unlock the Flowers theme in the Master Challenge (Theme 5)", "Unlock the City theme in the Master Challenge (Theme 7)", "Unlock the Eight-bit theme in the Master Challenge (Theme 8)", "Get at least 50,000 points in the Master Challenge", "Get at least 100,000 points in the Master Challenge", "Get at least 200,000 points in the Master Challenge", "Win a Rated game", "Win 3 Rated games in a row, in one session", "Win 5 Rated games in a row, in one session, starting with a Rating of at least 1500", "Win an 8-player Rated game", "Win an 8-player Rated game, defeating all opponents yourself", "Earn 50,000 points within the first two levels of the Master Challenge", "Win a Rated game without the glass breaking at all", "Defeat a FunOrb Moderator or someone who has this Achievement", "Send 500 shapes to other players in Rated games", "Send 1,000 shapes to other players in Rated games", "Send 2,500 shapes to other players in Rated games", "Send 5,000 shapes to other players in Rated games", "Send 10,000 shapes to other players in Rated games"};
        field_a = "Log in";
        field_g = "Accept <%0> into this game";
        field_f = "No";
        field_h = false;
        field_e = 0;
    }
}
