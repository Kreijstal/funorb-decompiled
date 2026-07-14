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
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dc var21 = null;
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
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        dc stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_24_0;
        short stackOut_23_0;
        short stackOut_27_0;
        int stackOut_26_0;
        int stackOut_30_0;
        short stackOut_29_0;
        dc stackOut_36_0;
        Object stackOut_37_0;
        int stackOut_47_0;
        int stackOut_46_0;
        int stackOut_43_0;
        int stackOut_42_0;
        int stackOut_15_0;
        int stackOut_14_0;
        int stackOut_12_0;
        int[] stackOut_16_0;
        int[] stackOut_18_0;
        int stackOut_18_1;
        int[] stackOut_17_0;
        int stackOut_17_1;
        var40 = BrickABrac.field_J ? 1 : 0;
        var45 = param4;
        if (param5 == -105) {
          L0: {
            L1: {
              if (null == var45.field_p) {
                break L1;
              } else {
                if (var45.field_A <= 1) {
                  break L1;
                } else {
                  var62 = var45.field_p;
                  h.a(0, 0, (byte) 114, var62, ke.field_m);
                  break L0;
                }
              }
            }
            a.f((byte) 94);
            break L0;
          }
          var66 = new int[param4.field_o];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param4.field_o];
          var65 = wl.field_R;
          var64 = ff.field_f;
          var63 = nn.field_h;
          var13 = 0;
          L2: while (true) {
            if (param4.field_o <= var13) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= mc.field_c) {
                  return;
                } else {
                  L4: {
                    var14 = ek.field_jb[var44];
                    var15 = param4.field_G[var14];
                    var16 = param4.field_b[var14];
                    var17 = param4.field_c[var14];
                    if (wl.field_R.length <= param4.field_v[var14]) {
                      stackOut_24_0 = -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L4;
                    } else {
                      stackOut_23_0 = param4.field_v[var14];
                      stackIn_25_0 = stackOut_23_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_25_0;
                    if (wl.field_R.length > param4.field_h[var14]) {
                      stackOut_27_0 = param4.field_h[var14];
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_26_0 = -1;
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_28_0;
                    if (wl.field_R.length <= param4.field_t[var14]) {
                      stackOut_30_0 = -1;
                      stackIn_31_0 = stackOut_30_0;
                      break L6;
                    } else {
                      stackOut_29_0 = param4.field_t[var14];
                      stackIn_31_0 = stackOut_29_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_31_0;
                      if (null == um.field_o) {
                        break L8;
                      } else {
                        if (param4.field_L == null) {
                          break L8;
                        } else {
                          if (var14 >= param4.field_L.length) {
                            break L8;
                          } else {
                            if (-1 == param4.field_L[var14]) {
                              break L8;
                            } else {
                              if (param4.field_L[var14] >= um.field_o.length) {
                                break L8;
                              } else {
                                stackOut_36_0 = um.field_o[param4.field_L[var14]];
                                stackIn_38_0 = stackOut_36_0;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = null;
                    stackIn_38_0 = (dc) (Object) stackOut_37_0;
                    break L7;
                  }
                  L9: {
                    var21 = (dc) (Object) stackIn_38_0;
                    var22 = da.field_M[var15];
                    var23 = ed.field_e[var15];
                    var24 = da.field_M[var16];
                    var25 = ed.field_e[var16];
                    var26 = da.field_M[var17];
                    var27 = ed.field_e[var17];
                    if (var19 != var18) {
                      break L9;
                    } else {
                      if (var19 == var20) {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 != null) {
                            stackOut_47_0 = var21.field_a;
                            stackIn_48_0 = stackOut_47_0;
                            break L10;
                          } else {
                            stackOut_46_0 = 8355711;
                            stackIn_48_0 = stackOut_46_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_48_0;
                        var31 = 16711935 & var30;
                        var32 = 65280 & var30;
                        var33 = (var28 * var31 & -16711791) >>> -459165464 | (var32 * var28 & 16711898) >>> -2062007032;
                        var33 = var33 + var29 * 65793;
                        ki.a(var33 >> 613294689 & 8355711, var23, var26, var22, var25, var27, var24, 116);
                        var44++;
                        continue L3;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21 != null) {
                      stackOut_43_0 = var21.field_a;
                      stackIn_44_0 = stackOut_43_0;
                      break L11;
                    } else {
                      stackOut_42_0 = 8355711;
                      stackIn_44_0 = stackOut_42_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_44_0;
                  var35 = var34 & 16711935;
                  var36 = 65280 & var34;
                  var37 = (var36 * var28 & 16711775) >>> 1991812168 | var35 * var28 >>> -1445684824 & -1895890689;
                  var38 = (-16711863 & var29 * var35) >>> 1920724872 | (var36 * var29 & 16711854) >>> -179591320;
                  var39 = (var35 * var30 & -16711923) >>> 568261832 | (16711836 & var30 * var36) >>> 126201832;
                  var38 = var38 + 65793 * var32;
                  var37 = var37 + 65793 * var31;
                  var39 = var39 + 65793 * var33;
                  tq.a(var39 & 255, 255 & var37 >> 941242568, var26, (65445 & var38) >> -1548321880, var24, var38 >> -803458448, var27, var39 >> -1814332600 & 255, var23, (byte) -55, var38 & 255, var22, 255 & var37, var39 >> -960612016, var25, var37 >> 1036571568);
                  var44++;
                  continue L3;
                }
              }
            } else {
              L12: {
                var14 = var63[var13] * param3 + param7 * var64[var13] + var65[var13] * param1 >> 245742632;
                if (0 > var14) {
                  var14 = -var14;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (0 <= var14) {
                  if (var14 < 128) {
                    stackOut_15_0 = 128 - -var14;
                    stackIn_16_0 = stackOut_15_0;
                    break L13;
                  } else {
                    stackOut_14_0 = 256;
                    stackIn_16_0 = stackOut_14_0;
                    break L13;
                  }
                } else {
                  stackOut_12_0 = 128;
                  stackIn_16_0 = stackOut_12_0;
                  break L13;
                }
              }
              L14: {
                var14 = stackIn_16_0;
                var15 = var63[var13] * param0 + (var64[var13] * param6 + var65[var13] * param2) >> 675725992;
                stackOut_16_0 = v.field_a;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (-1 >= (var15 ^ -1)) {
                  stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                  stackOut_18_1 = var15;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L14;
                } else {
                  stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                  stackOut_17_1 = -var15;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L14;
                }
              }
              var15 = stackIn_19_0[stackIn_19_1];
              var14 = var14 * (-var15 + 256) >>> 1195098408;
              var66[var13] = var14;
              var67[var13] = var15;
              var13++;
              continue L2;
            }
          }
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
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
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
            break L0;
          } else {
            k.field_h.a(-4, 18);
            break L0;
          }
        }
        L1: {
          k.field_h.field_l = k.field_h.field_l + 2;
          var5 = k.field_h.field_l;
          k.field_h.a(rp.field_x, (byte) -79);
          k.field_h.a(-23054, ud.field_E);
          var6 = 0;
          if (qb.field_u) {
            var6 = var6 | 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!ec.field_O) {
            break L2;
          } else {
            var6 = var6 | 4;
            break L2;
          }
        }
        L3: {
          if (!param3) {
            break L3;
          } else {
            var6 = var6 | 8;
            break L3;
          }
        }
        L4: {
          if (ai.field_t == null) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        if (!param4) {
          L5: {
            k.field_h.a(-105, var6);
            var7 = dj.a(true, uc.e((byte) -101));
            if (var7 != null) {
              break L5;
            } else {
              var7 = "";
              break L5;
            }
          }
          L6: {
            k.field_h.a(var7, -1);
            if (null == ai.field_t) {
              break L6;
            } else {
              k.field_h.a(0, ai.field_t);
              break L6;
            }
          }
          dq.a((wq) (Object) k.field_h, tq.field_f, vn.field_F, (byte) -72, to.field_g);
          k.field_h.c(k.field_h.field_l - var5, 255);
          cr.a(-1, 10000);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bc = new String[]{"Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Complete <%0> levels in one play-through.", "Complete <%0> levels in one play-through.", "Reach level <%0> in either level set.", "Complete all levels in one set.", "Score <%0> points.", "Score <%0> points.", "Bounce any ball <%0> times without it touching the paddle.", "Bounce any ball <%0> times without it touching the paddle.", "Use the Build power-up <%0> times in Rated games.", "Gain Rating in <%0> Rated games in a row.", "Gain Rating in <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Complete any level after the first with the Halloween background.", "Defeat a FunOrb Moderator or someone who has this Achievement.", "Build up <%0> victories against FunOrb Moderators.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Destroy one brick for each colour of a rainbow, in order, without using the plasma ball.", "Get <%0> level ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Recover from 'Panic!' (flashing red) during a Rated game, then go on to win.", "Win a Rated game using the plasma ball once, and only once, per level.", "Win a Rated game without collecting any power-ups.", "Complete <%0> levels without collecting positive power-ups.", "Collect <%0> negative power-ups in a row.", "Collect <%0> negative power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks without losing a life.", "Score <%0> points.", "Use the Weak power-up <%0> times in online multiplayer games, in one session during Hallowe'en."};
        field_Pb = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
