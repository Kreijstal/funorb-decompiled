/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wk extends ch implements tb {
    private qq field_W;
    static String field_V;
    static int field_P;
    private lr field_Q;
    static dd field_T;
    private fe[] field_R;
    static vh field_N;
    private int[] field_U;
    private int field_S;
    private String field_O;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Pool.field_O;
        if (!param0) {
            Object var9 = null;
            fe discarded$0 = ((wk) this).a((String) null, 93, (cc) null);
        }
        for (var6 = 0; var6 < ((wk) this).field_S; var6++) {
            if (!(((wk) this).field_R[var6] != param3)) {
                var7 = ((wk) this).field_U[var6];
                if (var7 == -1) {
                    ((wk) this).field_W.k(17);
                    break;
                }
                lf.a(((wk) this).field_U[var6], (byte) 78);
                break;
            }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 78, param2, param3);
        int discarded$0 = ((wk) this).field_Q.a(((wk) this).field_O, 14 + param2 - -((wk) this).field_C, ((wk) this).field_D + (param3 - -10), ((wk) this).field_l + -28, ((wk) this).field_y, 16777215, -1, 0, 0, ((wk) this).field_Q.field_C);
        int var5 = 6 % ((-42 - param1) / 53);
    }

    final fe a(String param0, int param1, cc param2) {
        fe var4 = new fe(param0, param2);
        var4.field_z = (fp) (Object) new ng();
        int var5 = -2 + ((wk) this).field_y;
        if (param1 > -77) {
            ((wk) this).field_R = null;
        }
        ((wk) this).a(((wk) this).field_l, 0, 34 + ((wk) this).field_y, false, 0);
        var4.a(((wk) this).field_l + -14, 7, 30, false, var5);
        ((wk) this).a(true, (ei) (Object) var4);
        return var4;
    }

    public static void h(int param0) {
        if (param0 >= -85) {
            wk.a(true, -59, false, -90);
        }
        field_N = null;
        field_V = null;
        field_T = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        fb.a();
        ob.field_i = 11;
        cp.field_d = new int[260];
        for (var1 = 0; -257 < (var1 ^ -1); var1++) {
            var2 = 15.0;
            cp.field_d[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        if (param0 != -257) {
            return;
        }
        int var4 = 256;
        var1 = var4;
        while (var4 < cp.field_d.length) {
            cp.field_d[var4] = 255;
            var4++;
        }
    }

    wk(qq param0, lr param1, String param2) {
        super(0, 0, 288, 0, (fp) null);
        ((wk) this).field_S = 0;
        ((wk) this).field_Q = param1;
        ((wk) this).field_W = param0;
        ((wk) this).field_O = param2;
        int var4 = null == ((wk) this).field_O ? 0 : ((wk) this).field_Q.b(((wk) this).field_O, 260, ((wk) this).field_Q.field_C);
        ((wk) this).a(288, 0, var4 + 22, false, 0);
    }

    final void a(int param0, String param1, int param2) {
        int var4 = ((wk) this).field_S;
        this.b((byte) 122, var4 + param2);
        ((wk) this).field_R[var4] = ((wk) this).a(param1, cq.a(param2, -115), (cc) this);
        ((wk) this).field_U[var4] = param0;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        vh var4_ref_vh = null;
        int var4 = 0;
        vh var5 = null;
        vh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int stackIn_10_0 = 0;
        String stackIn_26_0 = null;
        vh stackIn_36_0 = null;
        vh stackIn_37_0 = null;
        vh stackIn_38_0 = null;
        String stackIn_38_1 = null;
        vh stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        vh stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        vh stackIn_41_0 = null;
        String[] stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        String stackIn_41_3 = null;
        vh stackIn_64_0 = null;
        vh stackIn_65_0 = null;
        vh stackIn_66_0 = null;
        vh stackIn_67_0 = null;
        vh stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        vh stackIn_69_0 = null;
        vh stackIn_70_0 = null;
        vh stackIn_71_0 = null;
        vh stackIn_72_0 = null;
        vh stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        vh stackIn_74_0 = null;
        vh stackIn_75_0 = null;
        vh stackIn_76_0 = null;
        vh stackIn_77_0 = null;
        vh stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        vh stackOut_35_0 = null;
        vh stackOut_37_0 = null;
        String stackOut_37_1 = null;
        vh stackOut_36_0 = null;
        String stackOut_36_1 = null;
        vh stackOut_38_0 = null;
        String[] stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        vh stackOut_40_0 = null;
        String[] stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        String stackOut_40_3 = null;
        vh stackOut_39_0 = null;
        String[] stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        String stackOut_39_3 = null;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        vh stackOut_63_0 = null;
        vh stackOut_64_0 = null;
        vh stackOut_65_0 = null;
        vh stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        vh stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        vh stackOut_68_0 = null;
        vh stackOut_69_0 = null;
        vh stackOut_70_0 = null;
        vh stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        vh stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        vh stackOut_73_0 = null;
        vh stackOut_74_0 = null;
        vh stackOut_75_0 = null;
        vh stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        vh stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        L0: {
          var12 = Pool.field_O;
          fr.a((byte) -100, uf.field_z);
          if (null != tp.field_e) {
            L1: {
              L2: {
                var4_ref_vh = kc.field_b;
                kc.field_b.field_Db = 0;
                var4_ref_vh.field_gb = 0;
                var5 = d.field_c;
                d.field_c.field_Db = 0;
                var5.field_gb = 0;
                gi.field_o.field_Db = 0;
                var6 = gi.field_o;
                var6.field_gb = 0;
                ii.field_e.field_nb = of.field_Ub.toUpperCase();
                var7 = (uq.field_f.field_gb + 2) / 2;
                gi.field_o.b(uq.field_f.field_Db - 40, 2147483647, 0, var7 + -2, 40);
                d.field_c.b(-40 + uq.field_f.field_Db, 2147483647, var7, -var7 + uq.field_f.field_gb, 40);
                if ((dg.field_T.length ^ -1) != -2) {
                  break L2;
                } else {
                  if (dg.field_T[0] == 2) {
                    var8 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              L3: while (true) {
                L4: {
                  if (dg.field_T.length <= var10) {
                    break L4;
                  } else {
                    L5: {
                      if (0 == (md.field_c[var10 / 8] & 1 << (var10 & 7))) {
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
                      if (var11_int != 0) {
                        var9_int++;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (var11_int != 0) {
                      if (2 != dg.field_T[var10]) {
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
                if (var9_int != 0) {
                  break L1;
                } else {
                  var8 = 1;
                  break L1;
                }
              }
            }
            d.field_c.field_pb = true;
            if (!kh.field_Ac) {
              L7: {
                stackOut_35_0 = d.field_c;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (var8 != 0) {
                  stackOut_37_0 = (vh) (Object) stackIn_37_0;
                  stackOut_37_1 = hq.field_o;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L7;
                } else {
                  stackOut_36_0 = (vh) (Object) stackIn_36_0;
                  stackOut_36_1 = fo.field_d;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L7;
                }
              }
              L8: {
                stackIn_38_0.field_nb = ((String) (Object) stackIn_38_1).toUpperCase();
                stackOut_38_0 = v.field_j;
                stackOut_38_1 = new String[]{d.field_c.field_nb};
                stackOut_38_2 = -1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                if (var8 != 0) {
                  stackOut_40_0 = (vh) (Object) stackIn_40_0;
                  stackOut_40_1 = (String[]) (Object) stackIn_40_1;
                  stackOut_40_2 = stackIn_40_2;
                  stackOut_40_3 = n.field_Y;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  stackIn_41_3 = stackOut_40_3;
                  break L8;
                } else {
                  stackOut_39_0 = (vh) (Object) stackIn_39_0;
                  stackOut_39_1 = (String[]) (Object) stackIn_39_1;
                  stackOut_39_2 = stackIn_39_2;
                  stackOut_39_3 = bk.field_x;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  stackIn_41_3 = stackOut_39_3;
                  break L8;
                }
              }
              L9: {
                stackIn_41_0.field_nb = nr.a(stackIn_41_1, stackIn_41_2, stackIn_41_3);
                gi.field_o.field_nb = la.field_g;
                ok.field_ob.field_pb = true;
                qk.field_b = true;
                if (we.field_m == null) {
                  break L9;
                } else {
                  L10: {
                    if (null != dk.field_j) {
                      break L10;
                    } else {
                      gf.field_b = new boolean[dr.field_c];
                      dk.field_j = new byte[dr.field_c];
                      break L10;
                    }
                  }
                  qk.field_b = false;
                  ln.field_p = false;
                  var13 = 0;
                  var9_int = var13;
                  L11: while (true) {
                    if (dr.field_c <= var13) {
                      sh.a(0, dr.field_c, -1, false, tp.field_e, -1, -1, true);
                      if (2 > hq.field_i) {
                        break L9;
                      } else {
                        if (!vj.field_c[12]) {
                          break L9;
                        } else {
                          qk.field_b = true;
                          break L9;
                        }
                      }
                    } else {
                      gf.field_b[var13] = false;
                      var13++;
                      continue L11;
                    }
                  }
                }
              }
              if (qk.field_b) {
                break L0;
              } else {
                d.field_c.field_pb = false;
                if (!d.field_c.field_db) {
                  break L0;
                } else {
                  L12: {
                    var9 = null;
                    if (ln.field_p) {
                      var9 = (Object) (Object) ("<col=A00000>" + ab.field_h + "</col>");
                      var11 = var9;
                      var9 = var11;
                      var11 = var9;
                      var9 = var11;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L13: while (true) {
                    if (var10 >= dr.field_c) {
                      kk.field_B = "<col=A00000>" + wc.field_a + "<br>" + m.field_b + var9;
                      break L0;
                    } else {
                      if (gf.field_b[var10]) {
                        var11_ref = "<col=A00000>" + ck.field_R[var10] + "</col>";
                        var9 = (Object) (Object) var11_ref;
                        var9 = (Object) (Object) var11_ref;
                        if (var9 == null) {
                          var9 = (Object) (Object) var11_ref;
                          var10++;
                          continue L13;
                        } else {
                          var9 = (Object) (Object) (var9 + ", " + var11_ref);
                          var10++;
                          continue L13;
                        }
                      } else {
                        var10++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            } else {
              L14: {
                ok.field_ob.field_pb = false;
                v.field_j.field_nb = hl.field_c;
                if (var8 != 0) {
                  stackOut_25_0 = vi.field_a;
                  stackIn_26_0 = stackOut_25_0;
                  break L14;
                } else {
                  stackOut_24_0 = or.field_j;
                  stackIn_26_0 = stackOut_24_0;
                  break L14;
                }
              }
              L15: {
                var14 = stackIn_26_0;
                var9 = (Object) (Object) var14;
                var9 = (Object) (Object) var14;
                var9 = (Object) (Object) var14;
                var10 = gi.field_o.field_I.b(var14) - -(3 * gi.field_o.field_I.a('.'));
                if ((48 & va.field_V) != 16) {
                  break L15;
                } else {
                  var9 = (Object) (Object) (var14 + ".");
                  break L15;
                }
              }
              L16: {
                gi.field_o.field_Fb = 0;
                gi.field_o.field_tb = (gi.field_o.field_gb - var10) / 2;
                if (-33 == (48 & va.field_V ^ -1)) {
                  var9 = (Object) (Object) (var9 + "..");
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if ((48 & va.field_V) == 48) {
                  var9 = (Object) (Object) (var9 + "...");
                  break L17;
                } else {
                  break L17;
                }
              }
              gi.field_o.field_nb = (String) var9;
              d.field_c.field_nb = be.field_K.toUpperCase();
              break L0;
            }
          } else {
            break L0;
          }
        }
        L18: {
          L19: {
            stackOut_63_0 = so.field_k;
            stackIn_67_0 = stackOut_63_0;
            stackIn_64_0 = stackOut_63_0;
            if (!param2) {
              break L19;
            } else {
              stackOut_64_0 = (vh) (Object) stackIn_64_0;
              stackIn_67_0 = stackOut_64_0;
              stackIn_65_0 = stackOut_64_0;
              if (param0) {
                break L19;
              } else {
                stackOut_65_0 = (vh) (Object) stackIn_65_0;
                stackIn_67_0 = stackOut_65_0;
                stackIn_66_0 = stackOut_65_0;
                if (nr.field_bb) {
                  break L19;
                } else {
                  stackOut_66_0 = (vh) (Object) stackIn_66_0;
                  stackOut_66_1 = 1;
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  break L18;
                }
              }
            }
          }
          stackOut_67_0 = (vh) (Object) stackIn_67_0;
          stackOut_67_1 = 0;
          stackIn_68_0 = stackOut_67_0;
          stackIn_68_1 = stackOut_67_1;
          break L18;
        }
        L20: {
          L21: {
            ((vh) (Object) stackIn_68_0).a(stackIn_68_1 != 0, false);
            stackOut_68_0 = uq.field_f;
            stackIn_72_0 = stackOut_68_0;
            stackIn_69_0 = stackOut_68_0;
            if (!param2) {
              break L21;
            } else {
              stackOut_69_0 = (vh) (Object) stackIn_69_0;
              stackIn_72_0 = stackOut_69_0;
              stackIn_70_0 = stackOut_69_0;
              if (param0) {
                break L21;
              } else {
                stackOut_70_0 = (vh) (Object) stackIn_70_0;
                stackIn_72_0 = stackOut_70_0;
                stackIn_71_0 = stackOut_70_0;
                if (nr.field_bb) {
                  break L21;
                } else {
                  stackOut_71_0 = (vh) (Object) stackIn_71_0;
                  stackOut_71_1 = 1;
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  break L20;
                }
              }
            }
          }
          stackOut_72_0 = (vh) (Object) stackIn_72_0;
          stackOut_72_1 = 0;
          stackIn_73_0 = stackOut_72_0;
          stackIn_73_1 = stackOut_72_1;
          break L20;
        }
        L22: {
          L23: {
            ((vh) (Object) stackIn_73_0).a(stackIn_73_1 != 0, false);
            stackOut_73_0 = de.field_b;
            stackIn_77_0 = stackOut_73_0;
            stackIn_74_0 = stackOut_73_0;
            if (!param2) {
              break L23;
            } else {
              stackOut_74_0 = (vh) (Object) stackIn_74_0;
              stackIn_77_0 = stackOut_74_0;
              stackIn_75_0 = stackOut_74_0;
              if (param0) {
                break L23;
              } else {
                stackOut_75_0 = (vh) (Object) stackIn_75_0;
                stackIn_77_0 = stackOut_75_0;
                stackIn_76_0 = stackOut_75_0;
                if (!nr.field_bb) {
                  break L23;
                } else {
                  stackOut_76_0 = (vh) (Object) stackIn_76_0;
                  stackOut_76_1 = 1;
                  stackIn_78_0 = stackOut_76_0;
                  stackIn_78_1 = stackOut_76_1;
                  break L22;
                }
              }
            }
          }
          stackOut_77_0 = (vh) (Object) stackIn_77_0;
          stackOut_77_1 = 0;
          stackIn_78_0 = stackOut_77_0;
          stackIn_78_1 = stackOut_77_1;
          break L22;
        }
        L24: {
          ((vh) (Object) stackIn_78_0).a(stackIn_78_1 != 0, false);
          na.field_e.field_i.c(true);
          var4 = -10 % ((-1 - param3) / 35);
          if (null == tp.field_e) {
            break L24;
          } else {
            L25: {
              if (ok.field_ob.field_R != 0) {
                te.b(param1, -29);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (0 != d.field_c.field_R) {
                if (kh.field_Ac) {
                  me.b(-118, param1);
                  break L26;
                } else {
                  qd.a((byte) 81, param1);
                  break L26;
                }
              } else {
                break L26;
              }
            }
            tl.a(param1, tp.field_e, 0, true);
            break L24;
          }
        }
    }

    final static boolean a(eo param0, eo param1, int param2) {
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var3 = param0.field_Mb + -param1.field_Mb;
          if (param2 >= 17) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        L1: {
          if (param0.field_Wb != cm.field_J) {
            if (null == param0.field_Wb) {
              var3 += 200;
              break L1;
            } else {
              break L1;
            }
          } else {
            var3 -= 200;
            break L1;
          }
        }
        L2: {
          if (param1.field_Wb == cm.field_J) {
            var3 += 200;
            break L2;
          } else {
            if (param1.field_Wb == null) {
              var3 -= 200;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if ((var3 ^ -1) >= -1) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L3;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L3;
          }
        }
        return stackIn_15_0 != 0;
    }

    final static void a(int param0, int param1, lr param2, int param3, lr param4, int param5, int param6, nm param7, int param8, int param9, nm param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, nm param18, int param19, int param20) {
        ao.a((byte) -83, param0, param2, param4);
        kg.a(param12, true, param13, param5, param19);
        nj.a(param8, param9, -128);
        if (param16 != 255) {
            field_P = 121;
        }
        mf.a((byte) -91, param1, param10, param7, param3, param14);
        ve.a(111, param15, param17, param18);
        ta.a((byte) -96, param11, param20, param6);
    }

    private final void b(byte param0, int param1) {
        int var5 = 0;
        if (!(((wk) this).field_S < param1)) {
            return;
        }
        fe[] var6 = new fe[param1];
        fe[] var7 = var6;
        fe[] var3 = var7;
        int[] var4 = new int[param1];
        if (param0 < 117) {
            ((wk) this).a(18, (byte) 47, -48, 114);
        }
        for (var5 = 0; var5 < ((wk) this).field_S; var5++) {
            var6[var5] = ((wk) this).field_R[var5];
            var4[var5] = ((wk) this).field_U[var5];
        }
        ((wk) this).field_S = param1;
        ((wk) this).field_R = var7;
        ((wk) this).field_U = var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
