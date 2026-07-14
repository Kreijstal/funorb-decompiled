/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends eb {
    static int[] field_L;
    static int field_M;
    private int field_P;
    static String[] field_O;
    private rc field_K;
    static String field_N;

    final boolean a(byte param0, gl param1) {
        if (param0 <= 2) {
            return false;
        }
        return false;
    }

    final static boolean f(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 105) {
          L0: {
            dd.g((byte) -23);
            if (pe.field_a != ua.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (pe.field_a != ua.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final String f(int param0) {
        if (((dd) this).field_s) {
          return ((dd) this).field_K.b((byte) 126);
        } else {
          if (param0 > 70) {
            return null;
          } else {
            field_L = null;
            return null;
          }
        }
    }

    final static q a(byte param0, String param1) {
        String var2 = null;
        q var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Terraphoenix.field_V;
        if (gb.field_z != null) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var6 = (CharSequence) (Object) param1;
              var2 = hm.a(param0, var6);
              if (var2 != null) {
                var3 = (q) (Object) gb.field_z.a(71, (long)var2.hashCode());
                L0: while (true) {
                  if (var3 != null) {
                    var7 = (CharSequence) (Object) var3.field_Lb;
                    var4 = hm.a((byte) 124, var7);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (q) (Object) gb.field_z.c((byte) -66);
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(gl param0, int param1, int param2, int param3) {
        ((dd) this).field_P = ((dd) this).field_P + 1;
        if (param3 < 25) {
            return;
        }
        super.a(param0, param1, param2, 26);
    }

    public static void g(byte param0) {
        field_N = null;
        field_L = null;
        if (param0 < 106) {
            return;
        }
        field_O = null;
    }

    dd(rc param0) {
        ((dd) this).field_K = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        im var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ci var15 = null;
        ci var16 = null;
        ci var17 = null;
        ci var18 = null;
        ci var19 = null;
        ci var20 = null;
        ci var21 = null;
        ci var22 = null;
        var11 = Terraphoenix.field_V;
        super.a(param0, -114, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var5 = (((dd) this).field_p >> 1535762433) + param0 + ((dd) this).field_w;
          if (param1 > -106) {
            field_O = null;
            var6 = (((dd) this).field_n >> -1253016415) + (param3 - -((dd) this).field_u);
            var8 = ((dd) this).field_K.a(-16323);
            if (kj.field_d == var8) {
              var20 = og.field_c[0];
              var9 = var20.field_q << 1039490433;
              var10 = var20.field_u << -1713630015;
              if (ld.field_c != null) {
                if (var9 <= ld.field_c.field_r) {
                  if (var10 <= ld.field_c.field_t) {
                    il.a(1, ld.field_c);
                    l.a();
                    var20.b(112, 144, var20.field_q << 1600142980, var20.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                    ij.a(false);
                    ld.field_c.d(var5 - var20.field_q, -var20.field_u + var6, 256);
                    return;
                  } else {
                    ld.field_c = new ci(var9, var10);
                    il.a(1, ld.field_c);
                    var20.b(112, 144, var20.field_q << 1600142980, var20.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                    ij.a(false);
                    ld.field_c.d(var5 - var20.field_q, -var20.field_u + var6, 256);
                    return;
                  }
                } else {
                  ld.field_c = new ci(var9, var10);
                  il.a(1, ld.field_c);
                  var20.b(112, 144, var20.field_q << 1600142980, var20.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                  ij.a(false);
                  ld.field_c.d(var5 - var20.field_q, -var20.field_u + var6, 256);
                  return;
                }
              } else {
                ld.field_c = new ci(var9, var10);
                il.a(1, ld.field_c);
                var20.b(112, 144, var20.field_q << 1600142980, var20.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                ij.a(false);
                ld.field_c.d(var5 - var20.field_q, -var20.field_u + var6, 256);
                return;
              }
            } else {
              if (oh.field_b != var8) {
                if (qf.field_d != var8) {
                  if (dg.field_c != var8) {
                    return;
                  } else {
                    var22 = og.field_c[1];
                    var22.d(-(var22.field_r >> 907829121) + var5, var6 - (var22.field_t >> 7290497), 256);
                    return;
                  }
                } else {
                  var21 = og.field_c[2];
                  var21.d(var5 - (var21.field_r >> 1337755169), var6 + -(var21.field_t >> 1301737697), 256);
                  return;
                }
              } else {
                var19 = og.field_c[0];
                var9 = var19.field_q << 1039490433;
                var10 = var19.field_u << -1713630015;
                if (ld.field_c == null) {
                  ld.field_c = new ci(var9, var10);
                  il.a(1, ld.field_c);
                  var19.b(112, 144, var19.field_q << 1600142980, var19.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                  ij.a(false);
                  ld.field_c.d(var5 - var19.field_q, -var19.field_u + var6, 256);
                  return;
                } else {
                  L0: {
                    L1: {
                      if (var9 > ld.field_c.field_r) {
                        break L1;
                      } else {
                        if (var10 > ld.field_c.field_t) {
                          break L1;
                        } else {
                          il.a(1, ld.field_c);
                          l.a();
                          break L0;
                        }
                      }
                    }
                    ld.field_c = new ci(var9, var10);
                    il.a(1, ld.field_c);
                    break L0;
                  }
                  var19.b(112, 144, var19.field_q << 1600142980, var19.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                  ij.a(false);
                  ld.field_c.d(var5 - var19.field_q, -var19.field_u + var6, 256);
                  return;
                }
              }
            }
          } else {
            var6 = (((dd) this).field_n >> -1253016415) + (param3 - -((dd) this).field_u);
            var8 = ((dd) this).field_K.a(-16323);
            if (kj.field_d == var8) {
              var16 = og.field_c[0];
              var9 = var16.field_q << 1039490433;
              var10 = var16.field_u << -1713630015;
              if (ld.field_c != null) {
                if (var9 <= ld.field_c.field_r) {
                  if (var10 <= ld.field_c.field_t) {
                    il.a(1, ld.field_c);
                    l.a();
                    var16.b(112, 144, var16.field_q << 1600142980, var16.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                    ij.a(false);
                    ld.field_c.d(var5 - var16.field_q, -var16.field_u + var6, 256);
                    return;
                  } else {
                    ld.field_c = new ci(var9, var10);
                    il.a(1, ld.field_c);
                    var16.b(112, 144, var16.field_q << 1600142980, var16.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                    ij.a(false);
                    ld.field_c.d(var5 - var16.field_q, -var16.field_u + var6, 256);
                    return;
                  }
                } else {
                  ld.field_c = new ci(var9, var10);
                  il.a(1, ld.field_c);
                  var16.b(112, 144, var16.field_q << 1600142980, var16.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                  ij.a(false);
                  ld.field_c.d(var5 - var16.field_q, -var16.field_u + var6, 256);
                  return;
                }
              } else {
                ld.field_c = new ci(var9, var10);
                il.a(1, ld.field_c);
                var16.b(112, 144, var16.field_q << 1600142980, var16.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                ij.a(false);
                ld.field_c.d(var5 - var16.field_q, -var16.field_u + var6, 256);
                return;
              }
            } else {
              if (oh.field_b != var8) {
                if (qf.field_d != var8) {
                  if (dg.field_c != var8) {
                    return;
                  } else {
                    var18 = og.field_c[1];
                    var18.d(-(var18.field_r >> 907829121) + var5, var6 - (var18.field_t >> 7290497), 256);
                    return;
                  }
                } else {
                  var17 = og.field_c[2];
                  var17.d(var5 - (var17.field_r >> 1337755169), var6 + -(var17.field_t >> 1301737697), 256);
                  return;
                }
              } else {
                L2: {
                  L3: {
                    var15 = og.field_c[0];
                    var9 = var15.field_q << 1039490433;
                    var10 = var15.field_u << -1713630015;
                    if (ld.field_c == null) {
                      break L3;
                    } else {
                      if (var9 > ld.field_c.field_r) {
                        break L3;
                      } else {
                        if (var10 > ld.field_c.field_t) {
                          break L3;
                        } else {
                          il.a(1, ld.field_c);
                          l.a();
                          break L2;
                        }
                      }
                    }
                  }
                  ld.field_c = new ci(var9, var10);
                  il.a(1, ld.field_c);
                  break L2;
                }
                var15.b(112, 144, var15.field_q << 1600142980, var15.field_u << 1215479236, -((dd) this).field_P << -964864502, 4096);
                ij.a(false);
                ld.field_c.d(var5 - var15.field_q, -var15.field_u + var6, 256);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Create a free account to start using this feature";
        field_M = 4;
        field_O = new String[]{"Game console", "<col=fcfe7f>SOLDIER TABS -</col> Click on a tab to select a soldier. The number denotes how much time they have left. The <img=0> icon shows that the soldier can see hostiles.", "<col=fcfe7f>SOLDIER PORTRAIT", "<col=fcfe7f>TIME REMAINING -</col> Time is used to perform all actions.", "<col=fcfe7f>HEALTH -</col> Yellow portions regenerate each turn.", "<col=fcfe7f>ARMOUR -</col> Armour deflects attacks.", "<col=fcfe7f>PRIMARY WEAPON -</col> Click here to toggle attack mode.", "<col=fcfe7f>SECONDARY WEAPON -</col> Click here to toggle attack mode.", "<col=fcfe7f>GRENADES -</col> Click here to toggle grenade mode.", "<col=fcfe7f>END TURN -</col> Ending the turn allows the enemy to move and replenishes your time.", "<col=fcfe7f>READY MODE", "<col=fcfe7f>SPRINT MODE", "<col=fcfe7f>SCHEMATIC MODE", "<col=fcfe7f>DOWN LEVEL", "<col=fcfe7f>UP LEVEL", "<col=fcfe7f>NEXT SOLDIER", "<col=fcfe7f>CENTRE ON SOLDIER"};
    }
}
