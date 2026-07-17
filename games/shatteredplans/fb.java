/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends qr {
    qr field_Hb;
    boolean field_mc;
    static String field_kc;
    static String field_gc;
    qr field_Wb;
    qr field_Ib;
    qr field_Db;
    int field_Zb;
    qr field_Ub;
    boolean field_Qb;
    static long[] field_Cb;
    static int[] field_zb;
    String[] field_jc;
    qr field_Kb;
    qr field_Mb;
    static char[] field_yb;
    static String field_bc;
    long field_Gb;
    int field_hc;
    qr[] field_xb;
    qr field_Rb;
    boolean field_cc;
    int field_Fb;
    qr field_oc;
    int field_lc;
    boolean field_Ab;
    qr field_Pb;
    long field_fc;
    int field_nc;
    qr field_Sb;
    int field_Eb;
    qr field_ic;
    qr field_Tb;
    boolean field_ec;
    byte[] field_dc;
    boolean field_Yb;
    qr field_Bb;
    int field_Nb;
    String field_Xb;
    boolean field_Jb;
    int field_Lb;
    qr field_Ob;
    qr field_ac;
    static bi field_Vb;

    fb(int param0) {
        super(0L, (qr) null);
        ((fb) this).field_dc = new byte[param0];
    }

    public static void h(int param0) {
        field_Vb = null;
        field_kc = null;
        field_bc = null;
        field_Cb = null;
        field_yb = null;
        field_zb = null;
        field_gc = null;
    }

    final static lp a(int param0, int param1, int param2, int param3, fs param4, int param5, fs[] param6, dc param7) {
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        fs[] var11_ref_fs__ = null;
        int var11 = 0;
        int var12_int = 0;
        b var12 = null;
        fs var13 = null;
        ff var13_ref = null;
        qk var13_ref2 = null;
        String var14 = null;
        vd var15 = null;
        int var16 = 0;
        lp var17 = null;
        int stackIn_9_0 = 0;
        lp stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        lp stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var9 = -18 % ((param2 - -43) / 35);
            var17 = new lp(0, 0, 182, cc.field_n);
            var10 = 0;
            var11_ref_fs__ = param6;
            var12_int = 0;
            L1: while (true) {
              L2: {
                if (var11_ref_fs__.length <= var12_int) {
                  break L2;
                } else {
                  var13 = var11_ref_fs__[var12_int];
                  if (param4 != var13) {
                    var12_int++;
                    continue L1;
                  } else {
                    var10 = 1;
                    break L2;
                  }
                }
              }
              L3: {
                if (var10 != 0) {
                  stackOut_8_0 = 8421504;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 2105376;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              L4: {
                var11 = stackIn_9_0;
                var12 = new b(pf.field_a[param4.field_x].field_z / 2, -(rs.field_Cb.field_J / 2) + (var17.field_i / 2 - 4), -(pf.field_a[param4.field_x].field_z / 2) + var17.field_m, rs.field_Cb.field_J + 8, 2, var11);
                var17.a((vd) (Object) var12, 8);
                if ((param7.field_w & 1 << param4.field_x) == 0) {
                  var13_ref = new ff(pf.field_a[param4.field_x].field_z / 2, -1 + (var17.field_i / 2 - rs.field_Cb.field_J / 2), er.a(param5, (byte) -127, param1, param4, param3));
                  var17.a((vd) (Object) var13_ref, 8);
                  break L4;
                } else {
                  var13_ref2 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var17.field_i / 2, var17.field_m - pf.field_a[param4.field_x].field_z, rs.field_Cb.field_J, of.field_d.toUpperCase());
                  var17.a((vd) (Object) var13_ref2, 8);
                  break L4;
                }
              }
              L5: {
                if (var10 == 0) {
                  break L5;
                } else {
                  if (param0 > 3) {
                    break L5;
                  } else {
                    if (0 >= param0) {
                      break L5;
                    } else {
                      var13_ref2 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var17.field_i / 2, -pf.field_a[param4.field_x].field_z + var17.field_m, rs.field_Cb.field_J, re.a(ka.field_m, 4371, new String[1]));
                      var17.a((vd) (Object) var13_ref2, 8);
                      break L5;
                    }
                  }
                }
              }
              L6: {
                var13_ref = new ff(0, (-pf.field_a[param4.field_x].field_w + var17.field_i) / 2, pf.field_a[param4.field_x]);
                var17.a((vd) (Object) var13_ref, 8);
                if ((param7.field_w & 1 << param4.field_x) != 0) {
                  break L6;
                } else {
                  L7: {
                    if (1 != param3) {
                      if (param5 == 1) {
                        var14 = re.a(fa.field_S, 4371, new String[1]);
                        break L7;
                      } else {
                        var14 = re.a(jm.field_q, 4371, new String[2]);
                        break L7;
                      }
                    } else {
                      if (param5 != 1) {
                        var14 = re.a(ms.field_b, 4371, new String[1]);
                        break L7;
                      } else {
                        var14 = bc.field_a;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var10 == 0) {
                      break L8;
                    } else {
                      if (!param7.field_z) {
                        var14 = var14 + " " + ui.field_q;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var17.field_o = var14;
                  var15 = (vd) (Object) var17.field_l.d(0);
                  L9: while (true) {
                    if (var15 == null) {
                      break L6;
                    } else {
                      var15.field_o = var14;
                      var15 = (vd) (Object) var17.field_l.a((byte) -71);
                      continue L9;
                    }
                  }
                }
              }
              stackOut_31_0 = (lp) var17;
              stackIn_32_0 = stackOut_31_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var8;
            stackOut_33_1 = new StringBuilder().append("fb.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          L11: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(param5).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param6 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L11;
            }
          }
          L12: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param7 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_32_0;
    }

    final boolean f(byte param0) {
        if (param0 != -78) {
            return false;
        }
        return !((fb) this).a((byte) 98) ? true : false;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9) {
        int var11 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param5) {
            break L0;
          } else {
            L1: {
              if (kh.field_Mb != gf.field_b) {
                break L1;
              } else {
                if (el.field_c == gf.field_k) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (so.field_q.field_d != gf.field_k) {
              break L0;
            } else {
              if (gf.field_b != so.field_q.field_g) {
                break L0;
              } else {
                if (null == np.field_a) {
                  if (null == he.field_p) {
                    tc.j(param9 ^ 97);
                    break L0;
                  } else {
                    en.a(param9 + 15471, true);
                    break L0;
                  }
                } else {
                  en.a(15471, false);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (!param5) {
            tm.field_h = (kh.field_Mb - 640) / 2;
            break L2;
          } else {
            tm.field_h = gn.field_t;
            break L2;
          }
        }
        L3: {
          mf.a(true, param5);
          if (qa.field_t > param9) {
            hi.a(param0, param9 ^ -26671, param5, param2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          dn.field_f.field_y = 1;
          dn.field_f.field_kb = fg.field_b.field_kb;
          if (bc.field_b <= 0) {
            break L4;
          } else {
            bb.a(param5, param0, (byte) -2, param2);
            break L4;
          }
        }
        L5: {
          if (ee.field_k <= 0) {
            break L5;
          } else {
            uo.a((byte) 23, param0, param2, param7, param5);
            break L5;
          }
        }
        L6: {
          L7: {
            if (!ti.field_e) {
              break L7;
            } else {
              if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                ls.field_a.field_zb.field_z = gm.field_j;
                lp.field_v.field_s = false;
                fj.a(false, ls.field_a.field_xb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          lp.field_v.field_s = true;
          ls.field_a.field_zb.field_z = null;
          dm.a(param4, 0, ls.field_a, param1, param2);
          break L6;
        }
        ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
        dm.a(param4, 0, ro.field_a, param1, param2);
        ln.field_w = ln.field_w + 1;
    }

    final int g(int param0) {
        if (param0 >= -74) {
            int discarded$0 = ((fb) this).g(-46);
        }
        return (int)((fb) this).d((byte) 118);
    }

    final boolean a(fb param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        boolean stackOut_26_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                var7 = null;
                boolean discarded$1 = ((fb) this).a((fb) null, -74);
                break L1;
              }
            }
            L2: {
              if (!((fb) this).field_Jb) {
                if (((fb) this).field_hc == 6) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_8_0;
              if (!param0.field_Jb) {
                if (param0.field_hc == 6) {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = 1;
                stackIn_14_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var4 = stackIn_14_0;
              stackOut_14_0 = var4;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var3_int != 0) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L4;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L4;
              }
            }
            if (stackIn_17_0 != stackIn_17_1) {
              L5: {
                if (var3_int != 0) {
                  break L5;
                } else {
                  L6: {
                    if (((fb) this).field_cc) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L6;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L6;
                    }
                  }
                  if (stackIn_24_0 == (param0.field_cc ? 1 : 0)) {
                    stackOut_26_0 = ((fb) this).field_cc;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0;
                  } else {
                    if (!((fb) this).field_cc) {
                      break L5;
                    } else {
                      if (param0.field_nc == ((fb) this).field_nc) {
                        break L5;
                      } else {
                        L7: {
                          if (param0.field_nc <= ((fb) this).field_nc) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            break L7;
                          } else {
                            stackOut_31_0 = 1;
                            stackIn_33_0 = stackOut_31_0;
                            break L7;
                          }
                        }
                        return stackIn_33_0 != 0;
                      }
                    }
                  }
                }
              }
              L8: {
                if (((fb) this).field_Ab) {
                  stackOut_36_0 = 0;
                  stackIn_37_0 = stackOut_36_0;
                  break L8;
                } else {
                  stackOut_35_0 = 1;
                  stackIn_37_0 = stackOut_35_0;
                  break L8;
                }
              }
              if (stackIn_37_0 == (param0.field_Ab ? 1 : 0)) {
                L9: {
                  if (((fb) this).field_Ab) {
                    stackOut_41_0 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    break L9;
                  } else {
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L9;
                  }
                }
                return stackIn_42_0 != 0;
              } else {
                if (((fb) this).field_Ab) {
                  L10: {
                    if (((fb) this).field_mc) {
                      stackOut_52_0 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      break L10;
                    } else {
                      if (2 == ((fb) this).field_Fb) {
                        stackOut_51_0 = 1;
                        stackIn_54_0 = stackOut_51_0;
                        break L10;
                      } else {
                        stackOut_50_0 = 0;
                        stackIn_54_0 = stackOut_50_0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    var5 = stackIn_54_0;
                    if (!param0.field_mc) {
                      if (param0.field_Fb == 2) {
                        stackOut_58_0 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        break L11;
                      } else {
                        stackOut_57_0 = 0;
                        stackIn_60_0 = stackOut_57_0;
                        break L11;
                      }
                    } else {
                      stackOut_55_0 = 1;
                      stackIn_60_0 = stackOut_55_0;
                      break L11;
                    }
                  }
                  L12: {
                    var6 = stackIn_60_0;
                    if (var6 != 0) {
                      stackOut_62_0 = 0;
                      stackIn_63_0 = stackOut_62_0;
                      break L12;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L12;
                    }
                  }
                  L13: {
                    stackOut_63_0 = stackIn_63_0;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (var5 != 0) {
                      stackOut_65_0 = stackIn_65_0;
                      stackOut_65_1 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      break L13;
                    } else {
                      stackOut_64_0 = stackIn_64_0;
                      stackOut_64_1 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_66_1 = stackOut_64_1;
                      break L13;
                    }
                  }
                  if (stackIn_66_0 == stackIn_66_1) {
                    L14: {
                      if (~((fb) this).field_Gb >= ~param0.field_Gb) {
                        stackOut_71_0 = 0;
                        stackIn_72_0 = stackOut_71_0;
                        break L14;
                      } else {
                        stackOut_70_0 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        break L14;
                      }
                    }
                    break L0;
                  } else {
                    stackOut_67_0 = var5;
                    stackIn_68_0 = stackOut_67_0;
                    return stackIn_68_0 != 0;
                  }
                } else {
                  L15: {
                    if (((fb) this).field_Gb >= param0.field_Gb) {
                      stackOut_46_0 = 0;
                      stackIn_47_0 = stackOut_46_0;
                      break L15;
                    } else {
                      stackOut_45_0 = 1;
                      stackIn_47_0 = stackOut_45_0;
                      break L15;
                    }
                  }
                  return stackIn_47_0 != 0;
                }
              }
            } else {
              stackOut_18_0 = var3_int;
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var3;
            stackOut_73_1 = new StringBuilder().append("fb.A(");
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L16;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L16;
            }
          }
          throw r.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param1 + 41);
        }
        return stackIn_72_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gc = "Awaiting response";
        field_kc = "<%0> is not a member, and cannot play with the current options.";
        field_Cb = new long[32];
        field_yb = new char[128];
        field_bc = "Cancel";
    }
}
