/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends mh {
    String field_Rb;
    mh field_Wb;
    int field_Sb;
    static String field_Pb;
    mh field_Xb;
    static vl field_Tb;
    String field_Ub;
    String field_Qb;
    static String[] field_bc;
    String field_ac;
    static jp[] field_Vb;
    static jp field_Zb;
    mh field_Yb;

    final static void a(int param0, int param1, int param2, int param3, fr param4, byte param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        dc var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        fr var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        dc stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        short stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        dc stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var45 = param4;
            if (param5 == -105) {
              L1: {
                L2: {
                  if (null == var45.field_p) {
                    break L2;
                  } else {
                    if (var45.field_A <= 1) {
                      break L2;
                    } else {
                      var61 = var45.field_p;
                      h.a(0, 0, (byte) 114, var61, ke.field_m);
                      break L1;
                    }
                  }
                }
                a.f((byte) 94);
                break L1;
              }
              var55 = new int[param4.field_o];
              var50 = var55;
              var41 = var50;
              var8_array = var41;
              var65 = new int[param4.field_o];
              var64 = wl.field_R;
              var63 = ff.field_f;
              var62 = nn.field_h;
              var13 = 0;
              L3: while (true) {
                if (param4.field_o <= var13) {
                  var44 = 0;
                  var13 = var44;
                  L4: while (true) {
                    if (var44 >= mc.field_c) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L5: {
                        var14 = ek.field_jb[var44];
                        var15 = param4.field_G[var14];
                        var16 = param4.field_b[var14];
                        var17 = param4.field_c[var14];
                        if (wl.field_R.length <= param4.field_v[var14]) {
                          stackOut_25_0 = -1;
                          stackIn_26_0 = stackOut_25_0;
                          break L5;
                        } else {
                          stackOut_24_0 = param4.field_v[var14];
                          stackIn_26_0 = stackOut_24_0;
                          break L5;
                        }
                      }
                      L6: {
                        var18 = stackIn_26_0;
                        if (wl.field_R.length > param4.field_h[var14]) {
                          stackOut_28_0 = param4.field_h[var14];
                          stackIn_29_0 = stackOut_28_0;
                          break L6;
                        } else {
                          stackOut_27_0 = -1;
                          stackIn_29_0 = stackOut_27_0;
                          break L6;
                        }
                      }
                      L7: {
                        var19 = stackIn_29_0;
                        if (wl.field_R.length <= param4.field_t[var14]) {
                          stackOut_31_0 = -1;
                          stackIn_32_0 = stackOut_31_0;
                          break L7;
                        } else {
                          stackOut_30_0 = param4.field_t[var14];
                          stackIn_32_0 = stackOut_30_0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var20 = stackIn_32_0;
                          if (null == um.field_o) {
                            break L9;
                          } else {
                            if (param4.field_L == null) {
                              break L9;
                            } else {
                              if (var14 >= param4.field_L.length) {
                                break L9;
                              } else {
                                if (-1 == param4.field_L[var14]) {
                                  break L9;
                                } else {
                                  if (param4.field_L[var14] >= um.field_o.length) {
                                    break L9;
                                  } else {
                                    stackOut_37_0 = um.field_o[param4.field_L[var14]];
                                    stackIn_39_0 = stackOut_37_0;
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_38_0 = null;
                        stackIn_39_0 = (dc) ((Object) stackOut_38_0);
                        break L8;
                      }
                      L10: {
                        L11: {
                          var21_ref = stackIn_39_0;
                          var22 = da.field_M[var15];
                          var23 = ed.field_e[var15];
                          var24 = da.field_M[var16];
                          var25 = ed.field_e[var16];
                          var26 = da.field_M[var17];
                          var27 = ed.field_e[var17];
                          if (var19 != var18) {
                            break L11;
                          } else {
                            if (var19 == var20) {
                              L12: {
                                var28 = var55[var18];
                                var29 = var65[var18];
                                if (var21_ref != null) {
                                  stackOut_48_0 = var21_ref.field_a;
                                  stackIn_49_0 = stackOut_48_0;
                                  break L12;
                                } else {
                                  stackOut_47_0 = 8355711;
                                  stackIn_49_0 = stackOut_47_0;
                                  break L12;
                                }
                              }
                              var30 = stackIn_49_0;
                              var31 = 16711935 & var30;
                              var32 = 65280 & var30;
                              var33 = (var28 * var31 & -16711791) >>> -459165464 | (var32 * var28 & 16711898) >>> -2062007032;
                              var33 = var33 + var29 * 65793;
                              ki.a(var33 >> 613294689 & 8355711, var23, var26, var22, var25, var27, var24, 116);
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L13: {
                          var28 = var55[var18];
                          var29 = var55[var19];
                          var30 = var55[var20];
                          var31 = var65[var18];
                          var32 = var65[var19];
                          var33 = var65[var20];
                          if (var21_ref != null) {
                            stackOut_44_0 = var21_ref.field_a;
                            stackIn_45_0 = stackOut_44_0;
                            break L13;
                          } else {
                            stackOut_43_0 = 8355711;
                            stackIn_45_0 = stackOut_43_0;
                            break L13;
                          }
                        }
                        var34 = stackIn_45_0;
                        var35 = var34 & 16711935;
                        var36 = 65280 & var34;
                        var37 = (var36 * var28 & 16711775) >>> 1991812168 | var35 * var28 >>> -1445684824 & -1895890689;
                        var38 = (-16711863 & var29 * var35) >>> 1920724872 | (var36 * var29 & 16711854) >>> -179591320;
                        var39 = (var35 * var30 & -16711923) >>> 568261832 | (16711836 & var30 * var36) >>> 126201832;
                        var38 = var38 + 65793 * var32;
                        var37 = var37 + 65793 * var31;
                        var39 = var39 + 65793 * var33;
                        tq.a(var39 & 255, 255 & var37 >> 941242568, var26, (65445 & var38) >> -1548321880, var24, var38 >> -803458448, var27, var39 >> -1814332600 & 255, var23, (byte) -55, var38 & 255, var22, 255 & var37, var39 >> -960612016, var25, var37 >> 1036571568);
                        break L10;
                      }
                      var44++;
                      continue L4;
                    }
                  }
                } else {
                  L14: {
                    var14 = var62[var13] * param3 + param7 * var63[var13] + var64[var13] * param1 >> 245742632;
                    if (0 > var14) {
                      var14 = -var14;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (0 <= var14) {
                      if (var14 < 128) {
                        stackOut_16_0 = 128 - -var14;
                        stackIn_17_0 = stackOut_16_0;
                        break L15;
                      } else {
                        stackOut_15_0 = 256;
                        stackIn_17_0 = stackOut_15_0;
                        break L15;
                      }
                    } else {
                      stackOut_13_0 = 128;
                      stackIn_17_0 = stackOut_13_0;
                      break L15;
                    }
                  }
                  L16: {
                    var14 = stackIn_17_0;
                    var15 = var62[var13] * param0 + (var63[var13] * param6 + var64[var13] * param2) >> 675725992;
                    stackOut_17_0 = v.field_a;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (-1 >= (var15 ^ -1)) {
                      stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                      stackOut_19_1 = var15;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L16;
                    } else {
                      stackOut_18_0 = (int[]) ((Object) stackIn_18_0);
                      stackOut_18_1 = -var15;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L16;
                    }
                  }
                  var15 = stackIn_20_0[stackIn_20_1];
                  var14 = var14 * (-var15 + 256) >>> 1195098408;
                  var55[var13] = var14;
                  var65[var13] = var15;
                  var13++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var8);
            stackOut_52_1 = new StringBuilder().append("mp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        field_Tb = null;
        field_Pb = null;
        field_Zb = null;
        field_Vb = null;
        if (param0 >= -54) {
            return;
        }
        field_bc = null;
    }

    mp() {
        super(0L, (mh) null);
    }

    final static void a(int param0, ff param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              lc.field_a[0] = ji.field_e.nextInt();
              lc.field_a[1] = ji.field_e.nextInt();
              tq.field_f.field_l = 0;
              lc.field_a[3] = (int)bj.field_ab;
              lc.field_a[2] = (int)(bj.field_ab >> 405033632);
              tq.field_f.a(lc.field_a[0], (byte) -79);
              tq.field_f.a(lc.field_a[1], (byte) -79);
              tq.field_f.a(lc.field_a[2], (byte) -79);
              tq.field_f.a(lc.field_a[3], (byte) -79);
              he.a(tq.field_f, (byte) -95);
              tq.field_f.b((byte) 113, param0);
              param1.a(0, tq.field_f);
              k.field_h.field_l = 0;
              if (!param2) {
                k.field_h.a(94, 16);
                break L1;
              } else {
                k.field_h.a(-4, 18);
                break L1;
              }
            }
            L2: {
              k.field_h.field_l = k.field_h.field_l + 2;
              var5_int = k.field_h.field_l;
              k.field_h.a(rp.field_x, (byte) -79);
              k.field_h.a(-23054, ud.field_E);
              var6 = 0;
              if (qb.field_u) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!ec.field_O) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (!param3) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (ai.field_t == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            if (!param4) {
              L6: {
                k.field_h.a(-105, var6);
                var7 = dj.a(true, uc.e((byte) -101));
                if (var7 != null) {
                  break L6;
                } else {
                  var7 = "";
                  break L6;
                }
              }
              L7: {
                k.field_h.a(var7, -1);
                if (null == ai.field_t) {
                  break L7;
                } else {
                  k.field_h.a(0, ai.field_t);
                  break L7;
                }
              }
              dq.a(k.field_h, tq.field_f, vn.field_F, (byte) -72, to.field_g);
              k.field_h.c(k.field_h.field_l - var5_int, 255);
              cr.a(-1, 10000);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("mp.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_bc = new String[]{"Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Complete <%0> levels in one play-through.", "Complete <%0> levels in one play-through.", "Reach level <%0> in either level set.", "Complete all levels in one set.", "Score <%0> points.", "Score <%0> points.", "Bounce any ball <%0> times without it touching the paddle.", "Bounce any ball <%0> times without it touching the paddle.", "Use the Build power-up <%0> times in Rated games.", "Gain Rating in <%0> Rated games in a row.", "Gain Rating in <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Complete any level after the first with the Halloween background.", "Defeat a FunOrb Moderator or someone who has this Achievement.", "Build up <%0> victories against FunOrb Moderators.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Destroy one brick for each colour of a rainbow, in order, without using the plasma ball.", "Get <%0> level ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Recover from 'Panic!' (flashing red) during a Rated game, then go on to win.", "Win a Rated game using the plasma ball once, and only once, per level.", "Win a Rated game without collecting any power-ups.", "Complete <%0> levels without collecting positive power-ups.", "Collect <%0> negative power-ups in a row.", "Collect <%0> negative power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks without losing a life.", "Score <%0> points.", "Use the Weak power-up <%0> times in online multiplayer games, in one session during Hallowe'en."};
        field_Pb = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
