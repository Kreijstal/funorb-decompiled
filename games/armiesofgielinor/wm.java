/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static je field_c;
    static String field_d;
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -10743) {
          field_b = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, nr param6, int param7, byte param8, int param9, int param10, int param11, nr param12, int param13, ka param14, int param15, int param16, ka param17, int param18, int param19, nr param20) {
        br.a(param14, param9, 333, param17);
        if (param8 <= 80) {
          return;
        } else {
          uc.a(param11, param19, param5, false, param4);
          pt.c(param0, param2, 56);
          qf.a(param6, param10, param7, param12, param15, -125);
          dr.a(param16, (byte) 96, param13, param20);
          ek.a(param1, param3, -118, param18);
          return;
        }
    }

    final static mo a(int param0, int param1, byte param2, int param3) {
        mo var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mo var8_ref_mo = null;
        int var9 = 0;
        mo var9_ref_mo = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        vq.field_a.field_Jb.field_fb.b(108);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = -1 + lk.field_h;
        L0: while (true) {
          if ((var7 ^ -1) > -1) {
            L1: {
              var7 = 0;
              var8 = 0;
              if (param2 > 126) {
                break L1;
              } else {
                wm.a(44);
                break L1;
              }
            }
            L2: while (true) {
              if (lk.field_h <= var8) {
                var8 = -var7 + (var6 + (vq.field_a.field_Jb.field_ob - -vq.field_a.field_Jb.field_nb));
                vq.field_a.field_Jb.field_ob = vq.field_a.field_Jb.field_ob - var8;
                vq.field_a.field_Jb.field_ab = vq.field_a.field_Jb.field_ab + var8;
                if (!kr.field_J) {
                  L3: {
                    vq.field_a.field_Jb.field_nb = -vq.field_a.field_Jb.field_ob + var7;
                    if (kr.field_J) {
                      vq.field_a.field_Jb.field_ab = vq.field_a.field_Nb.field_ob - vq.field_a.field_Jb.field_ob;
                      vq.field_a.field_Jb.field_db = 0;
                      kr.field_J = false;
                      cu.field_c = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!hf.field_c) {
                      break L4;
                    } else {
                      if (null != eu.field_g) {
                        cu.field_c = true;
                        break L4;
                      } else {
                        var9 = -vq.field_a.field_Jb.field_nb - (vq.field_a.field_Jb.field_ob - vq.field_a.field_Nb.field_ob);
                        if (cu.field_c) {
                          L5: {
                            vq.field_a.field_Jb.field_db = var9 + -vq.field_a.field_Jb.field_ab;
                            vq.field_a.a(param0, true, 2 * param0 * param3, false);
                            if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                              stackOut_69_0 = 0;
                              stackIn_70_0 = stackOut_69_0;
                              break L5;
                            } else {
                              stackOut_68_0 = 1;
                              stackIn_70_0 = stackOut_68_0;
                              break L5;
                            }
                          }
                          cu.field_c = stackIn_70_0 != 0;
                          return var4;
                        } else {
                          L6: {
                            vq.field_a.a(param0, true, 2 * param0 * param3, false);
                            if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                              stackOut_65_0 = 0;
                              stackIn_66_0 = stackOut_65_0;
                              break L6;
                            } else {
                              stackOut_64_0 = 1;
                              stackIn_66_0 = stackOut_64_0;
                              break L6;
                            }
                          }
                          cu.field_c = stackIn_66_0 != 0;
                          return var4;
                        }
                      }
                    }
                  }
                  var9 = -vq.field_a.field_Jb.field_nb - (vq.field_a.field_Jb.field_ob - vq.field_a.field_Nb.field_ob);
                  if (cu.field_c) {
                    L7: {
                      vq.field_a.field_Jb.field_db = var9 + -vq.field_a.field_Jb.field_ab;
                      vq.field_a.a(param0, true, 2 * param0 * param3, false);
                      if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                        stackOut_80_0 = 0;
                        stackIn_81_0 = stackOut_80_0;
                        break L7;
                      } else {
                        stackOut_79_0 = 1;
                        stackIn_81_0 = stackOut_79_0;
                        break L7;
                      }
                    }
                    cu.field_c = stackIn_81_0 != 0;
                    return var4;
                  } else {
                    L8: {
                      vq.field_a.a(param0, true, 2 * param0 * param3, false);
                      if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                        stackOut_76_0 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        break L8;
                      } else {
                        stackOut_75_0 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        break L8;
                      }
                    }
                    cu.field_c = stackIn_77_0 != 0;
                    return var4;
                  }
                } else {
                  L9: {
                    vq.field_a.field_Jb.field_ob = var7;
                    vq.field_a.field_Jb.field_nb = -vq.field_a.field_Jb.field_ob + var7;
                    if (kr.field_J) {
                      vq.field_a.field_Jb.field_ab = vq.field_a.field_Nb.field_ob - vq.field_a.field_Jb.field_ob;
                      vq.field_a.field_Jb.field_db = 0;
                      kr.field_J = false;
                      cu.field_c = true;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (hf.field_c) {
                    L10: {
                      if (null != eu.field_g) {
                        cu.field_c = true;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var9 = -vq.field_a.field_Jb.field_nb - (vq.field_a.field_Jb.field_ob - vq.field_a.field_Nb.field_ob);
                    if (cu.field_c) {
                      L11: {
                        vq.field_a.field_Jb.field_db = var9 + -vq.field_a.field_Jb.field_ab;
                        vq.field_a.a(param0, true, 2 * param0 * param3, false);
                        if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                          stackOut_54_0 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          break L11;
                        } else {
                          stackOut_53_0 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          break L11;
                        }
                      }
                      cu.field_c = stackIn_55_0 != 0;
                      return var4;
                    } else {
                      L12: {
                        vq.field_a.a(param0, true, 2 * param0 * param3, false);
                        if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                          stackOut_50_0 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          break L12;
                        } else {
                          stackOut_49_0 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          break L12;
                        }
                      }
                      cu.field_c = stackIn_51_0 != 0;
                      return var4;
                    }
                  } else {
                    var9 = -vq.field_a.field_Jb.field_nb - (vq.field_a.field_Jb.field_ob - vq.field_a.field_Nb.field_ob);
                    if (cu.field_c) {
                      L13: {
                        vq.field_a.field_Jb.field_db = var9 + -vq.field_a.field_Jb.field_ab;
                        vq.field_a.a(param0, true, 2 * param0 * param3, false);
                        if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          break L13;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L13;
                        }
                      }
                      cu.field_c = stackIn_42_0 != 0;
                      return var4;
                    } else {
                      L14: {
                        vq.field_a.a(param0, true, 2 * param0 * param3, false);
                        if (vq.field_a.field_Jb.field_db + vq.field_a.field_Jb.field_ab != var9) {
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          break L14;
                        } else {
                          stackOut_36_0 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          break L14;
                        }
                      }
                      cu.field_c = stackIn_38_0 != 0;
                      return var4;
                    }
                  }
                }
              } else {
                var9_ref_mo = an.field_F[var8];
                if (null != var9_ref_mo.field_u) {
                  L15: {
                    vq.field_a.field_Jb.a(var9_ref_mo.field_u, 65);
                    var9_ref_mo.field_u.a(param0, -20500, var9_ref_mo.field_u.j(-49), var7, param1);
                    if (0 == var9_ref_mo.field_u.field_yb) {
                      break L15;
                    } else {
                      var4 = var9_ref_mo;
                      break L15;
                    }
                  }
                  var7 = var7 + param0;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            L16: {
              var8_ref_mo = an.field_F[var7];
              var9 = 0;
              if (bb.field_a) {
                break L16;
              } else {
                if (vj.field_g <= var5) {
                  break L16;
                } else {
                  var10_int = kp.a(var8_ref_mo.field_b, -125);
                  if (var8_ref_mo.a(true) >= var10_int) {
                    L17: {
                      if (var8_ref_mo.field_f) {
                        break L17;
                      } else {
                        if (si.a(var8_ref_mo.field_m, -3404)) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var9 = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
            }
            if (var9 != 0) {
              L18: {
                if (null == var8_ref_mo.field_u) {
                  break L18;
                } else {
                  if (kr.field_J) {
                    break L18;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L19: {
                if (null != var8_ref_mo.field_u) {
                  break L19;
                } else {
                  s.field_d = s.field_d + 1;
                  break L19;
                }
              }
              var10 = af.a(var8_ref_mo, (byte) 103);
              var11 = var10 + ka.c(var8_ref_mo.field_h);
              var12 = hm.a(var8_ref_mo, -5);
              var8_ref_mo.field_u = new je(0L, uf.field_i, var11);
              var8_ref_mo.field_u.field_T = (uf.field_i.field_T >> 789491681 & 8355711) + (var12 + -((var12 & 16711423) >> 1914537153));
              var8_ref_mo.field_u.field_Z = tc.field_e;
              var8_ref_mo.field_u.field_W = (uf.field_i.field_W >> -447622335 & 8355711) + var12 + -(8355711 & var12 >> 1835063521);
              var6 = var6 + param0;
              var8_ref_mo.field_u.field_N = var12;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_mo.field_u = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (param0 == 0) {
          if (null != ik.field_b) {
            var3 = ik.field_b.a(param2, (byte) -112);
            if ((var3 ^ -1) == 1) {
              return;
            } else {
              L0: {
                if ((var3 ^ -1) != 0) {
                  var4 = ik.field_b.o(0) ? 1 : 0;
                  fu.a(ik.field_b.k(1), var3, ik.field_b.field_Sb, 29231, var4 != 0, param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              ik.field_b = null;
              ot.g(76);
              return;
            }
          } else {
            return;
          }
        } else {
          mo discarded$1 = wm.a(-77, -115, (byte) -120, -123);
          if (null != ik.field_b) {
            var3 = ik.field_b.a(param2, (byte) -112);
            if ((var3 ^ -1) == 1) {
              return;
            } else {
              L1: {
                if ((var3 ^ -1) != 0) {
                  var4 = ik.field_b.o(0) ? 1 : 0;
                  fu.a(ik.field_b.k(1), var3, ik.field_b.field_Sb, 29231, var4 != 0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              ik.field_b = null;
              ot.g(76);
              return;
            }
          } else {
            return;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Creating your account";
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
