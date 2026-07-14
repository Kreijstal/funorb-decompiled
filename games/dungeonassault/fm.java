/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static int field_e;
    static md field_b;
    private fm field_c;
    static int[] field_h;
    static gb field_f;
    static String field_l;
    static String field_j;
    static String field_d;
    static int field_a;
    static int field_g;
    static int field_i;
    private k field_k;

    final static cn b(int param0, int param1) {
        if (-1 != param1) {
          if (-2 == param1) {
            return tn.field_I;
          } else {
            if (param0 == -29092) {
              if (2 != param1) {
                if (3 != param1) {
                  if (param1 != -5) {
                    if (-6 == param1) {
                      return in.field_D;
                    } else {
                      if (6 != param1) {
                        if (7 != param1) {
                          if (-9 != (param1 ^ -1)) {
                            if (9 != param1) {
                              if (10 != param1) {
                                if (11 == param1) {
                                  return jl.field_c;
                                } else {
                                  if (-13 == param1) {
                                    return g.field_Ib;
                                  } else {
                                    if (-14 != param1) {
                                      if ((param1 ^ -1) == -15) {
                                        return ie.field_i;
                                      } else {
                                        if ((param1 ^ -1) != -16) {
                                          if (param1 != -17) {
                                            if (17 != param1) {
                                              if (-19 != param1) {
                                                if (-20 == (param1 ^ -1)) {
                                                  return bj.field_F;
                                                } else {
                                                  if (param1 == 20) {
                                                    return m.field_c;
                                                  } else {
                                                    if (param1 != 21) {
                                                      if (param1 != -23) {
                                                        if (23 != param1) {
                                                          if (-25 != param1) {
                                                            if (25 != param1) {
                                                              if (param1 == 27) {
                                                                return ld.field_d;
                                                              } else {
                                                                if ((param1 ^ -1) == -29) {
                                                                  return fn.field_o;
                                                                } else {
                                                                  if (param1 == 31) {
                                                                    return ld.field_d;
                                                                  } else {
                                                                    if (33 != param1) {
                                                                      if ((param1 ^ -1) == -35) {
                                                                        return fp.field_b;
                                                                      } else {
                                                                        if (21 != param1) {
                                                                          return tn.field_I;
                                                                        } else {
                                                                          return up.field_b;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      return oo.field_c;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              return DungeonAssault.field_I;
                                                            }
                                                          } else {
                                                            return ef.field_e;
                                                          }
                                                        } else {
                                                          return jc.field_c;
                                                        }
                                                      } else {
                                                        return ll.field_q;
                                                      }
                                                    } else {
                                                      return up.field_b;
                                                    }
                                                  }
                                                }
                                              } else {
                                                return df.field_e;
                                              }
                                            } else {
                                              return gd.field_A;
                                            }
                                          } else {
                                            return le.field_d;
                                          }
                                        } else {
                                          return na.field_A;
                                        }
                                      }
                                    } else {
                                      return ef.field_e;
                                    }
                                  }
                                }
                              } else {
                                return kf.field_k;
                              }
                            } else {
                              return cg.field_b;
                            }
                          } else {
                            return ub.field_j;
                          }
                        } else {
                          return sp.field_a;
                        }
                      } else {
                        return ia.field_R;
                      }
                    }
                  } else {
                    return lj.field_o;
                  }
                } else {
                  return hl.field_h;
                }
              } else {
                return qd.field_d;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int[][] param0, int param1, int param2, byte param3) {
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        cn var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        L0: {
          L1: {
            var24 = DungeonAssault.field_K;
            if (null == uc.field_E) {
              break L1;
            } else {
              if (param2 * param1 == uc.field_E.field_c.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4_ref_int__ = new int[64];
          var5 = 0;
          L2: while (true) {
            if (var5 >= 64) {
              var5_ref = te.a(param1, param2, var4_ref_int__, 16, 8, 0.125);
              uc.field_E = new ph(var5_ref, te.b(param1, param2, 0.125));
              break L0;
            } else {
              var4_ref_int__[var5] = mp.a(65793 * (var5 + 24), -2147483648);
              var5++;
              continue L2;
            }
          }
        }
        var4 = -(param1 / 2) + 320;
        var5 = -(param2 / 2) + 240;
        uc.field_E.b(var4, var5);
        gf.b(var4, var5, param1, param2, 6637335);
        qe.b(var4, var5, param1, param2, 8421504, 128, 128);
        var6 = be.field_o.field_d / 2;
        var7 = bk.field_e.field_b / 2;
        un.a(var4, (byte) 41, param1, var5 - var7, true);
        un.a(var4, (byte) 81, param1, -var7 + var5 + param2, true);
        vf.a(param2, true, var4 + -var6, 118, var5);
        vf.a(param2, true, var4 - (var6 + -param1), 101, var5);
        var8 = 37;
        var9 = 20;
        var10 = -var9 + var4;
        var11 = -var8 + var5;
        var12 = -oe.field_m.field_d + (var9 + param1 + var4);
        oe.field_m.h(var10, var11);
        var13 = var5 + -var8;
        if (param3 <= -16) {
          L3: {
            oe.field_m.j(var12, var13);
            jn.field_n.b(486513968);
            var14 = 14;
            var15 = 37;
            var16 = jn.field_n.field_j >> -681978448;
            var17 = jn.field_n.field_t >> -38776304;
            jn.field_n.field_v.a(var10 + var15 + -var17, var14 + var11 - var16);
            var18 = var12;
            var18 = var18 + oe.field_m.field_d;
            var18 = var18 - jn.field_n.field_v.field_h;
            var18 = var18 - var15;
            var18 = var18 + var17;
            jn.field_n.field_v.b(var18, -var16 + (var14 + var13));
            if (param0 != null) {
              var19 = 0;
              L4: while (true) {
                if (param0.length <= var19) {
                  break L3;
                } else {
                  if (param0[var19] != null) {
                    var20 = param0[var19][0];
                    var21 = param0[var19][1];
                    var22 = param0[var19][2];
                    var22 -= 4;
                    var21 += 2;
                    var23 = param0[var19][3];
                    var20 += 2;
                    var23 -= 4;
                    gf.e(var20, var21, var22 + var20, var21 - -var23);
                    en.a((byte) -1, var20, var22, 4 + var23, var21);
                    gf.b();
                    rp.a(4, var22, (byte) 108, var20, var23, kc.field_S, var21);
                    var19++;
                    continue L4;
                  } else {
                    var19++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          qe discarded$1 = bf.field_f[mn.field_b];
          qe.e();
          return;
        } else {
          return;
        }
    }

    final static boolean a(ec param0, int param1) {
        if (param1 > -55) {
            field_f = null;
        }
        int var2 = param0.c(true);
        int var3 = -2 != (var2 ^ -1) ? 0 : 1;
        return var3 != 0;
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -115) {
            break L0;
          } else {
            field_i = 2;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == na.field_D) {
              break L2;
            } else {
              if (na.field_D.i(32) == null) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var6 = DungeonAssault.field_K;
        int var4 = -1;
        int var5 = param2;
        if (param1 < 9) {
            cn discarded$0 = fm.b(-123, -68);
        }
        while (param0 > var5) {
            var4 = var4 >>> -594858200 ^ ih.field_J[255 & (var4 ^ param3[var5])];
            var5++;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_l = null;
        field_d = null;
        field_b = null;
        field_h = null;
        if (param0) {
            return;
        }
        field_j = null;
    }

    final String a(String param0, int param1) {
        int var4 = DungeonAssault.field_K;
        k var3 = ((fm) this).field_k;
        if (param1 > -45) {
            cn discarded$0 = fm.b(104, -22);
        }
        while (var3 != null) {
            if (!(!param0.equals((Object) (Object) var3.field_g))) {
                return var3.field_i;
            }
            var3 = var3.field_d;
        }
        if (!(null == ((fm) this).field_c)) {
            return ((fm) this).field_c.a(param0, -96);
        }
        return null;
    }

    final void a(String param0, int param1, String param2) {
        int var6 = DungeonAssault.field_K;
        int var5 = 119 / ((param1 - -30) / 59);
        k var4 = ((fm) this).field_k;
        while (var4 != null) {
            if (!(!param2.equals((Object) (Object) var4.field_g))) {
                var4.field_i = param0;
                return;
            }
            var4 = var4.field_d;
        }
        ((fm) this).field_k = new k(param2, param0, ((fm) this).field_k);
    }

    final String a(String param0, byte param1) {
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        if (param0 == null) {
            return null;
        }
        StringBuilder var12 = new StringBuilder(param0.length());
        if (param1 != -48) {
            cn discarded$0 = fm.b(-93, -72);
        }
        String var4 = "<%";
        String var5 = ">";
        int var6 = 0;
        int var7 = param0.length();
        while (var6 < var7) {
            var8 = param0.indexOf(var4, var6);
            if (!(-1 >= (var8 ^ -1))) {
                StringBuilder discarded$1 = var12.append(param0.substring(var6, var7));
                break;
            }
            StringBuilder discarded$2 = var12.append(param0.substring(var6, var8));
            var6 = var8;
            var8 = param0.indexOf(var5, var6 - -2);
            if (var8 < 0) {
                StringBuilder discarded$3 = var12.append(param0.substring(var6, var7));
                break;
            }
            var9 = param0.substring(2 + var6, var8);
            var10 = ((fm) this).a(var9, param1 ^ 91);
            if (var10 != null) {
                StringBuilder discarded$4 = var12.append(var10);
            }
            var6 = var8 - -1;
        }
        return var12.toString();
    }

    final static void a(int param0, int param1) {
        Object var3 = null;
        ba.a((rj) null, (byte) 59, param1);
        if (param0 <= 30) {
            fm.a(true);
        }
    }

    public fm() {
    }

    fm(fm param0) {
        ((fm) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_l = "May avoid combat.";
        field_d = "The orc warrior's weapon and armour may be battered from his years of war, he remains a competent if unspectacular fighter.";
        field_a = field_e;
        field_h = new int[8192];
        field_j = "Passwords must be between 5 and 20 characters long";
        field_i = 10080;
    }
}
