/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ic extends ka implements vo {
    static String[] field_bb;
    private qm field_ab;

    private final qm a(String param0, byte param1, fn param2) {
        qm var4 = new qm(param0, param2);
        var4.field_y = (eb) (Object) new ad();
        int var5 = ((ic) this).field_C + -6;
        ((ic) this).field_C = ((ic) this).field_C + 38;
        var4.a(-16 + (((ic) this).field_E - 14), (byte) 64, var5, 15, 30);
        if (param1 > -111) {
            field_bb = null;
        }
        ((ic) this).b((ng) (Object) var4, 80);
        ((ic) this).c((byte) 121);
        return var4;
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        if (!(param0 != ((ic) this).field_ab)) {
            this.g(true);
        }
        if (param2 != 11) {
            ic.a(-85, true, 100, false);
        }
    }

    private final void g(boolean param0) {
        if (!param0) {
            ((ic) this).field_ab = null;
        }
        if (!(((ic) this).field_N)) {
            return;
        }
        ((ic) this).field_N = false;
    }

    ic(kn param0, fp param1) {
        super(param0, 200, 150);
        String var3 = null;
        ng var4 = null;
        L0: {
          var3 = null;
          if (jg.field_F == param1) {
            var3 = mn.field_a;
            break L0;
          } else {
            if (ia.field_c != param1) {
              if (param1 != fh.field_Q) {
                break L0;
              } else {
                var3 = ha.field_k;
                ((ic) this).field_C = ((ic) this).field_C + 30;
                break L0;
              }
            } else {
              ((ic) this).field_C = ((ic) this).field_C + 10;
              var3 = l.field_o;
              if (!ke.a(false)) {
                break L0;
              } else {
                ((ic) this).field_C = ((ic) this).field_C + 20;
                var3 = co.field_e;
                break L0;
              }
            }
          }
        }
        var4 = new ng(var3, (fn) null);
        var4.field_z = 0;
        var4.field_E = ((ic) this).field_E;
        var4.field_C = 80;
        var4.field_p = 50;
        var4.field_y = (eb) (Object) new uc(ep.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((ic) this).b(var4, 80);
        ((ic) this).field_ab = this.a(od.field_Hb, (byte) -126, (fn) this);
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        ak var5 = null;
        ak var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ak var15 = null;
        String var16 = null;
        ak var17 = null;
        int stackIn_10_0 = 0;
        String stackIn_25_0 = null;
        ak stackIn_33_0 = null;
        ak stackIn_34_0 = null;
        ak stackIn_35_0 = null;
        String stackIn_35_1 = null;
        ak stackIn_36_0 = null;
        ak stackIn_37_0 = null;
        ak stackIn_38_0 = null;
        String stackIn_38_1 = null;
        ak stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        ak stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        ak stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        ak stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        ak stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        ak stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        ak stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        ak stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        ak stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        ak stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        ak stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        ak stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        ak stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        ak stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        ak stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        ak stackOut_32_0 = null;
        ak stackOut_34_0 = null;
        String stackOut_34_1 = null;
        ak stackOut_33_0 = null;
        String stackOut_33_1 = null;
        ak stackOut_35_0 = null;
        ak stackOut_37_0 = null;
        String stackOut_37_1 = null;
        ak stackOut_36_0 = null;
        String stackOut_36_1 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        ak stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        ak stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        ak stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ak stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        ak stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        ak stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        ak stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        ak stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        ak stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        ak stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        ak stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        ak stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        ak stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        ak stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        ak stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        L0: {
          var12 = Pixelate.field_H ? 1 : 0;
          cm.b(vn.field_g, param2 ^ 4743);
          if (bn.field_S != null) {
            L1: {
              L2: {
                wm.field_d.field_nb = 0;
                var15 = wm.field_d;
                var17 = var15;
                var17.field_K = 0;
                var5 = ep.field_a;
                ep.field_a.field_nb = 0;
                var5.field_K = 0;
                var6 = nk.field_e;
                nk.field_e.field_nb = 0;
                var6.field_K = 0;
                vp.field_Qb.field_cb = vn.field_d.toUpperCase();
                var7 = (ai.field_A.field_K + 2) / 2;
                nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, 256, -2 + var7);
                ep.field_a.a(ai.field_A.field_nb - 40, 40, var7, 256, ai.field_A.field_K + -var7);
                if (-2 != (ia.field_a.length ^ -1)) {
                  break L2;
                } else {
                  if (ia.field_a[0] != 2) {
                    break L2;
                  } else {
                    var8 = 0;
                    break L1;
                  }
                }
              }
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              L3: while (true) {
                L4: {
                  if (var10 >= ia.field_a.length) {
                    break L4;
                  } else {
                    L5: {
                      if (-1 == (qm.field_J[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L5;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L5;
                      }
                    }
                    L6: {
                      var11_int = stackIn_10_0;
                      if (var11_int == 0) {
                        break L6;
                      } else {
                        var9_int++;
                        break L6;
                      }
                    }
                    if (var11_int != 0) {
                      if (2 != ia.field_a[var10]) {
                        var8 = 1;
                        break L4;
                      } else {
                        var10++;
                        continue L3;
                      }
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
                if (0 == var9_int) {
                  var8 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ep.field_a.field_rb = true;
            if (!rl.field_r) {
              L7: {
                stackOut_32_0 = ep.field_a;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if (var8 == 0) {
                  stackOut_34_0 = (ak) (Object) stackIn_34_0;
                  stackOut_34_1 = bc.field_n;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L7;
                } else {
                  stackOut_33_0 = (ak) (Object) stackIn_33_0;
                  stackOut_33_1 = qo.field_x;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L7;
                }
              }
              L8: {
                stackIn_35_0.field_cb = ((String) (Object) stackIn_35_1).toUpperCase();
                stackOut_35_0 = an.field_a;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (var8 != 0) {
                  stackOut_37_0 = (ak) (Object) stackIn_37_0;
                  stackOut_37_1 = oh.field_d;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L8;
                } else {
                  stackOut_36_0 = (ak) (Object) stackIn_36_0;
                  stackOut_36_1 = vk.field_sb;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L8;
                }
              }
              L9: {
                stackIn_38_0.field_cb = sd.a(stackIn_38_1, 59, new String[1]);
                gk.field_kb.field_rb = true;
                nk.field_e.field_cb = dn.field_b;
                pb.field_f = true;
                if (null != h.field_Z) {
                  L10: {
                    ib.field_b = false;
                    if (null == kf.field_o) {
                      lc.field_t = new boolean[fj.field_b];
                      kf.field_o = new byte[fj.field_b];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  pb.field_f = false;
                  var13 = 0;
                  var9_int = var13;
                  L11: while (true) {
                    if (fj.field_b <= var13) {
                      no.a(fj.field_b, 0, (byte) 91, true, -1, -1, bn.field_S, -1);
                      if (-3 < (wo.field_h ^ -1)) {
                        break L9;
                      } else {
                        if (bc.field_m[12]) {
                          pb.field_f = true;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      lc.field_t[var13] = false;
                      var13++;
                      continue L11;
                    }
                  }
                } else {
                  break L9;
                }
              }
              if (!pb.field_f) {
                ep.field_a.field_rb = false;
                if (ep.field_a.field_R) {
                  L12: {
                    var9 = null;
                    if (!ib.field_b) {
                      break L12;
                    } else {
                      var9 = "<col=A00000>" + pk.field_e + "</col>";
                      var11 = var9;
                      var9 = var11;
                      var11 = var9;
                      var9 = var11;
                      break L12;
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (var10 >= fj.field_b) {
                      up.field_o = "<col=A00000>" + lo.field_Gb + "<br>" + ij.field_p + var9;
                      break L0;
                    } else {
                      if (lc.field_t[var10]) {
                        var11 = "<col=A00000>" + jk.field_e[var10] + "</col>";
                        var9 = var11;
                        var9 = var11;
                        if (var9 != null) {
                          var9 = var9 + ", " + var11;
                          var10++;
                          continue L13;
                        } else {
                          var9 = var11;
                          var10++;
                          continue L13;
                        }
                      } else {
                        var10++;
                        continue L13;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              L14: {
                an.field_a.field_cb = mj.field_g;
                gk.field_kb.field_rb = false;
                if (var8 != 0) {
                  stackOut_24_0 = ag.field_o;
                  stackIn_25_0 = stackOut_24_0;
                  break L14;
                } else {
                  stackOut_23_0 = oi.field_b;
                  stackIn_25_0 = stackOut_23_0;
                  break L14;
                }
              }
              L15: {
                var16 = stackIn_25_0;
                var9 = var16;
                var9 = var16;
                var9 = var16;
                var10 = nk.field_e.field_Db.c(var16) + nk.field_e.field_Db.a('.') * 3;
                if (16 != (48 & rb.field_o)) {
                  break L15;
                } else {
                  var9 = var16 + ".";
                  break L15;
                }
              }
              L16: {
                nk.field_e.field_C = (nk.field_e.field_K - var10) / 2;
                nk.field_e.field_Bb = 0;
                if (-33 != (rb.field_o & 48 ^ -1)) {
                  break L16;
                } else {
                  var9 = var9 + "..";
                  break L16;
                }
              }
              L17: {
                if ((rb.field_o & 48) != 48) {
                  break L17;
                } else {
                  var9 = var9 + "...";
                  break L17;
                }
              }
              nk.field_e.field_cb = var9;
              ep.field_a.field_cb = fa.field_f.toUpperCase();
              break L0;
            }
          } else {
            break L0;
          }
        }
        L18: {
          L19: {
            stackOut_64_0 = ff.field_h;
            stackOut_64_1 = -28476;
            stackIn_68_0 = stackOut_64_0;
            stackIn_68_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (!param1) {
              break L19;
            } else {
              stackOut_65_0 = (ak) (Object) stackIn_65_0;
              stackOut_65_1 = stackIn_65_1;
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              if (param3) {
                break L19;
              } else {
                stackOut_66_0 = (ak) (Object) stackIn_66_0;
                stackOut_66_1 = stackIn_66_1;
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (bm.field_o) {
                  break L19;
                } else {
                  stackOut_67_0 = (ak) (Object) stackIn_67_0;
                  stackOut_67_1 = stackIn_67_1;
                  stackOut_67_2 = 1;
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L18;
                }
              }
            }
          }
          stackOut_68_0 = (ak) (Object) stackIn_68_0;
          stackOut_68_1 = stackIn_68_1;
          stackOut_68_2 = 0;
          stackIn_69_0 = stackOut_68_0;
          stackIn_69_1 = stackOut_68_1;
          stackIn_69_2 = stackOut_68_2;
          break L18;
        }
        L20: {
          L21: {
            ((ak) (Object) stackIn_69_0).a(stackIn_69_1, stackIn_69_2 != 0);
            stackOut_69_0 = ai.field_A;
            stackOut_69_1 = param2 + -28479;
            stackIn_73_0 = stackOut_69_0;
            stackIn_73_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (!param1) {
              break L21;
            } else {
              stackOut_70_0 = (ak) (Object) stackIn_70_0;
              stackOut_70_1 = stackIn_70_1;
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              if (param3) {
                break L21;
              } else {
                stackOut_71_0 = (ak) (Object) stackIn_71_0;
                stackOut_71_1 = stackIn_71_1;
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (bm.field_o) {
                  break L21;
                } else {
                  stackOut_72_0 = (ak) (Object) stackIn_72_0;
                  stackOut_72_1 = stackIn_72_1;
                  stackOut_72_2 = 1;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L20;
                }
              }
            }
          }
          stackOut_73_0 = (ak) (Object) stackIn_73_0;
          stackOut_73_1 = stackIn_73_1;
          stackOut_73_2 = 0;
          stackIn_74_0 = stackOut_73_0;
          stackIn_74_1 = stackOut_73_1;
          stackIn_74_2 = stackOut_73_2;
          break L20;
        }
        L22: {
          ((ak) (Object) stackIn_74_0).a(stackIn_74_1, stackIn_74_2 != 0);
          if (param2 == 3) {
            break L22;
          } else {
            field_bb = null;
            break L22;
          }
        }
        L23: {
          L24: {
            stackOut_76_0 = ra.field_e;
            stackOut_76_1 = param2 ^ -28473;
            stackIn_80_0 = stackOut_76_0;
            stackIn_80_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (!param1) {
              break L24;
            } else {
              stackOut_77_0 = (ak) (Object) stackIn_77_0;
              stackOut_77_1 = stackIn_77_1;
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              if (param3) {
                break L24;
              } else {
                stackOut_78_0 = (ak) (Object) stackIn_78_0;
                stackOut_78_1 = stackIn_78_1;
                stackIn_80_0 = stackOut_78_0;
                stackIn_80_1 = stackOut_78_1;
                stackIn_79_0 = stackOut_78_0;
                stackIn_79_1 = stackOut_78_1;
                if (!bm.field_o) {
                  break L24;
                } else {
                  stackOut_79_0 = (ak) (Object) stackIn_79_0;
                  stackOut_79_1 = stackIn_79_1;
                  stackOut_79_2 = 1;
                  stackIn_81_0 = stackOut_79_0;
                  stackIn_81_1 = stackOut_79_1;
                  stackIn_81_2 = stackOut_79_2;
                  break L23;
                }
              }
            }
          }
          stackOut_80_0 = (ak) (Object) stackIn_80_0;
          stackOut_80_1 = stackIn_80_1;
          stackOut_80_2 = 0;
          stackIn_81_0 = stackOut_80_0;
          stackIn_81_1 = stackOut_80_1;
          stackIn_81_2 = stackOut_80_2;
          break L23;
        }
        L25: {
          ((ak) (Object) stackIn_81_0).a(stackIn_81_1, stackIn_81_2 != 0);
          nd.field_b.field_g.b((byte) -108);
          if (null == bn.field_S) {
            break L25;
          } else {
            L26: {
              if (0 == gk.field_kb.field_P) {
                break L26;
              } else {
                fb.a(1, param0);
                break L26;
              }
            }
            L27: {
              if (-1 == (ep.field_a.field_P ^ -1)) {
                break L27;
              } else {
                if (!rl.field_r) {
                  r.a(param2 + -3, param0);
                  break L27;
                } else {
                  wo.c(-1, param0);
                  break L27;
                }
              }
            }
            be.a(true, bn.field_S, param0, -1);
            break L25;
          }
        }
    }

    public static void e(byte param0) {
        field_bb = null;
        int var1 = 90 / ((param0 - 62) / 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new String[]{"Online head-to-head rated games", "Unlimited Challenge Mode levels", "Complete all fifty puzzles", "Full screen mode"};
    }
}
