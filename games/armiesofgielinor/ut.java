/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ut extends sf implements he {
    private fw field_bb;
    static String field_ib;
    private fw field_ab;
    private fw field_mb;
    private fw field_Y;
    private fw field_Z;
    private gh field_lb;
    private boolean field_hb;
    static byte[][] field_W;
    private boolean field_jb;
    private ob field_gb;
    static int field_eb;
    static String[] field_cb;
    static int field_fb;
    private fw[] field_kb;
    private ls[] field_db;
    private boolean field_nb;
    private fw field_X;

    ut(gk param0) {
        super(param0, 430, 254);
        int var2 = 0;
        int var3 = 0;
        ls[] var3_ref_ls__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        fw var6 = null;
        int var7_int = 0;
        kb var7 = null;
        ls var8 = null;
        String var10 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_53_0 = null;
        ob stackIn_53_1 = null;
        ob stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        ob stackIn_54_1 = null;
        ob stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        ob stackIn_55_1 = null;
        ob stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        Object stackIn_56_0 = null;
        ob stackIn_56_1 = null;
        ob stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_78_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        ob stackOut_52_1 = null;
        ob stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        Object stackOut_53_0 = null;
        ob stackOut_53_1 = null;
        ob stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        Object stackOut_54_0 = null;
        ob stackOut_54_1 = null;
        ob stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_55_0 = null;
        ob stackOut_55_1 = null;
        ob stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        L0: {
          ((ut) this).field_db = ma.a(-114, ft.field_m);
          if ((((ut) this).field_db.length ^ -1) >= -1) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var2 >= ((ut) this).field_db.length) {
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ((ut) this).field_db.length) {
                    var3_ref_ls__ = ((ut) this).field_db;
                    ((ut) this).field_db = new ls[var2];
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_ref_ls__.length) {
                        uf.a(((ut) this).field_db, 1680474497);
                        break L0;
                      } else {
                        if (var3_ref_ls__[var5] != null) {
                          var4++;
                          ((ut) this).field_db[var4] = var3_ref_ls__[var5];
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (((ut) this).field_db[var3] != null) {
                      var2++;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((ut) this).field_db[var2] != null) {
                  var3 = var2 + 1;
                  L4: while (true) {
                    if (((ut) this).field_db.length <= var3) {
                      if (null != ra.field_e) {
                        if (null != ((ut) this).field_db[var2]) {
                          if (!ra.field_e.c(((ut) this).field_db[var2].field_b, 122, ((ut) this).field_db[var2].field_a)) {
                            ((ut) this).field_db[var2] = null;
                            var2++;
                            continue L1;
                          } else {
                            var2++;
                            continue L1;
                          }
                        } else {
                          var2++;
                          continue L1;
                        }
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      if (null != ((ut) this).field_db[var3]) {
                        if (((ut) this).field_db[var3].field_b == ((ut) this).field_db[var2].field_b) {
                          if (((ut) this).field_db[var3].field_a == ((ut) this).field_db[var2].field_a) {
                            ((ut) this).field_db[var3] = null;
                            var3++;
                            continue L4;
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        L5: {
          stackOut_32_0 = this;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if (((ut) this).field_db.length <= 0) {
            stackOut_34_0 = this;
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L5;
          } else {
            stackOut_33_0 = this;
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L5;
          }
        }
        L6: {
          ((ut) this).field_jb = stackIn_35_1 != 0;
          if (!pr.b(85)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L6;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_38_0;
          stackOut_38_0 = this;
          stackIn_40_0 = stackOut_38_0;
          stackIn_39_0 = stackOut_38_0;
          if (nw.g(79)) {
            stackOut_40_0 = this;
            stackOut_40_1 = 0;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            break L7;
          } else {
            stackOut_39_0 = this;
            stackOut_39_1 = 1;
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            break L7;
          }
        }
        L8: {
          ((ut) this).field_hb = stackIn_41_1 != 0;
          if (var2 != 0) {
            stackOut_43_0 = 3;
            stackIn_44_0 = stackOut_43_0;
            break L8;
          } else {
            stackOut_42_0 = 2;
            stackIn_44_0 = stackOut_42_0;
            break L8;
          }
        }
        L9: {
          var3 = stackIn_44_0;
          if (var2 == 0) {
            if (null != ra.field_e) {
              if (ra.field_e.d((byte) 122)) {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              } else {
                stackOut_49_0 = 0;
                stackIn_52_0 = stackOut_49_0;
                break L9;
              }
            } else {
              stackOut_47_0 = 0;
              stackIn_52_0 = stackOut_47_0;
              break L9;
            }
          } else {
            stackOut_45_0 = 0;
            stackIn_52_0 = stackOut_45_0;
            break L9;
          }
        }
        L10: {
          L11: {
            var4 = stackIn_52_0;
            stackOut_52_0 = this;
            stackOut_52_1 = null;
            stackOut_52_2 = null;
            stackOut_52_3 = 10;
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_55_2 = stackOut_52_2;
            stackIn_55_3 = stackOut_52_3;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            stackIn_53_2 = stackOut_52_2;
            stackIn_53_3 = stackOut_52_3;
            if (var2 != 0) {
              break L11;
            } else {
              stackOut_53_0 = this;
              stackOut_53_1 = null;
              stackOut_53_2 = null;
              stackOut_53_3 = stackIn_53_3;
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              stackIn_55_3 = stackOut_53_3;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              if (var4 != 0) {
                break L11;
              } else {
                stackOut_54_0 = this;
                stackOut_54_1 = null;
                stackOut_54_2 = null;
                stackOut_54_3 = stackIn_54_3;
                stackOut_54_4 = 75;
                stackIn_56_0 = stackOut_54_0;
                stackIn_56_1 = stackOut_54_1;
                stackIn_56_2 = stackOut_54_2;
                stackIn_56_3 = stackOut_54_3;
                stackIn_56_4 = stackOut_54_4;
                break L10;
              }
            }
          }
          stackOut_55_0 = this;
          stackOut_55_1 = null;
          stackOut_55_2 = null;
          stackOut_55_3 = stackIn_55_3;
          stackOut_55_4 = 58;
          stackIn_56_0 = stackOut_55_0;
          stackIn_56_1 = stackOut_55_1;
          stackIn_56_2 = stackOut_55_2;
          stackIn_56_3 = stackOut_55_3;
          stackIn_56_4 = stackOut_55_4;
          break L10;
        }
        L12: {
          new ob(stackIn_56_3, stackIn_56_4, 410, 105, (kh) null, var3, 1);
          ((ut) this).field_gb = (ob) (Object) stackIn_56_1;
          ((ut) this).field_gb.field_Q = 83;
          ((ut) this).field_gb.d(5, 57, 5);
          ((ut) this).a((byte) 10, (kb) (Object) ((ut) this).field_gb);
          ((ut) this).field_mb = this.a((qo) this, oq.field_j, oa.field_H, false);
          if (var2 == 0) {
            break L12;
          } else {
            ((ut) this).field_Z = this.a((qo) this, jd.field_n, dq.field_e, false);
            break L12;
          }
        }
        L13: {
          ((ut) this).field_bb = this.a((qo) this, oo.field_e, tg.field_b, false);
          stackOut_58_0 = this;
          stackIn_60_0 = stackOut_58_0;
          stackIn_59_0 = stackOut_58_0;
          if (var2 != 0) {
            stackOut_60_0 = this;
            stackOut_60_1 = 3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L13;
          } else {
            stackOut_59_0 = this;
            stackOut_59_1 = 2;
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            break L13;
          }
        }
        L14: {
          ((ut) this).field_kb = new fw[stackIn_61_1];
          ((ut) this).field_kb[0] = ((ut) this).field_mb;
          if (var2 == 0) {
            break L14;
          } else {
            ((ut) this).field_kb[2] = ((ut) this).field_Z;
            break L14;
          }
        }
        L15: {
          ((ut) this).field_kb[1] = ((ut) this).field_bb;
          if (!((ut) this).field_jb) {
            break L15;
          } else {
            if (var2 == 0) {
              break L15;
            } else {
              var5_ref_String__ = new String[((ut) this).field_db.length];
              var6_int = -1 + var5_ref_String__.length;
              var7_int = 0;
              L16: while (true) {
                if (var7_int >= ((ut) this).field_db.length) {
                  ((ut) this).field_lb = new gh((Object[]) (Object) var5_ref_String__, var6_int, 150);
                  ((ut) this).field_lb.a(((ut) this).field_bb.field_B + ((ut) this).field_gb.field_B, 126, ((ut) this).field_bb.field_w + ((ut) this).field_bb.field_p + (((ut) this).field_gb.field_p + -19), 8192, 18);
                  ((ut) this).field_D.a(750, (tc) (Object) ((ut) this).field_lb);
                  break L15;
                } else {
                  L17: {
                    var8 = ((ut) this).field_db[var7_int];
                    if (null == wq.field_a) {
                      break L17;
                    } else {
                      if (var8.field_b != ra.field_e.field_f) {
                        break L17;
                      } else {
                        if (ra.field_e.field_n != var8.field_a) {
                          break L17;
                        } else {
                          var6_int = var7_int;
                          break L17;
                        }
                      }
                    }
                  }
                  var5_ref_String__[var7_int] = var8.field_b + "<times>" + var8.field_a;
                  var7_int++;
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          L19: {
            ((ut) this).field_X = this.a((byte) 38, pe.field_w, (qo) this);
            var5 = ((ut) this).field_X.field_l / 2 + ((ut) this).field_X.field_B;
            ((ut) this).field_X.field_l = 150;
            ((ut) this).field_X.field_B = -((ut) this).field_X.field_l + -20 + var5;
            ((ut) this).field_ab = this.a((byte) 38, nr.field_f, (qo) this);
            ((ut) this).field_ab.field_I = false;
            ((ut) this).field_ab.field_B = var5 - -20;
            ((ut) this).field_ab.field_l = ((ut) this).field_X.field_l;
            if (var2 != 0) {
              break L19;
            } else {
              if (var4 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (var2 != 0) {
              stackOut_77_0 = oj.field_l;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = fj.field_w;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var10 = (String) (Object) stackIn_78_0;
          var6 = (fw) (Object) var10;
          var7 = new kb(var10, (qo) null);
          var7.field_p = 163;
          var7.field_B = 0;
          var7.field_l = ((ut) this).field_l;
          var7.field_w = 80;
          var7.field_k = (kh) (Object) new lk(ArmiesOfGielinor.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
          ((ut) this).a((byte) 10, var7);
          break L18;
        }
        L21: {
          ((ut) this).field_nb = false;
          var6 = this.o(-1);
          if (var6 == null) {
            break L21;
          } else {
            var6.field_K = true;
            break L21;
          }
        }
    }

    private final fw o(int param0) {
        if (param0 != -1) {
            return null;
        }
        if (wq.field_a != null) {
            return ((ut) this).field_bb;
        }
        if (ra.field_e != null) {
            if (ra.field_e.field_h) {
                if (((ut) this).field_Z != null) {
                    return ((ut) this).field_Z;
                }
            }
        }
        return ((ut) this).field_mb;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 11) {
            break L0;
          } else {
            var8 = null;
            fw discarded$2 = this.a((qo) null, (String) null, (ru[]) null, true);
            break L0;
          }
        }
        L1: {
          if (param4 == ((ut) this).field_X) {
            this.n(118);
            break L1;
          } else {
            if (param4 == ((ut) this).field_ab) {
              this.r(param1 + -12);
              break L1;
            } else {
              if (param4 == ((ut) this).field_mb) {
                this.a(param4, (byte) 34);
                break L1;
              } else {
                if (param4 != ((ut) this).field_Z) {
                  L2: {
                    if (((ut) this).field_lb != null) {
                      if (((ut) this).field_lb.field_t) {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L2;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_13_0 = stackOut_10_0;
                        break L2;
                      }
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_13_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  var6 = stackIn_13_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (param4 != ((ut) this).field_bb) {
                      break L1;
                    } else {
                      if (((ut) this).field_jb) {
                        if (-1 <= (df.field_M ^ -1)) {
                          ((ut) this).field_G.a((kb) (Object) new tn(((ut) this).field_G), 0);
                          break L1;
                        } else {
                          this.a(param4, (byte) 34);
                          break L1;
                        }
                      } else {
                        ((ut) this).field_G.a((kb) (Object) new ud(((ut) this).field_G, hm.field_h), 0);
                        break L1;
                      }
                    }
                  }
                } else {
                  this.a(param4, (byte) 34);
                  break L1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        qk.field_d = (param0 << -1851057136) / 150;
        qk.field_c = param0 * 400 / 150;
        if (param1 != 122) {
            return;
        }
        qk.field_a = param0 * 100 / 150;
    }

    private final void r(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ut) this).field_mb == ((ut) this).field_Y) {
            ck.b(param0 + -59);
            jb.e(param0 ^ -17024);
        } else {
            if (((ut) this).field_Y == ((ut) this).field_Z) {
                ck.b(-109);
                jj.a(-4223);
            } else {
                if (((ut) this).field_bb == ((ut) this).field_Y) {
                    if (((ut) this).field_lb != null) {
                        var2 = ((ut) this).field_lb.a((byte) 71);
                        if (-1 >= (var2 ^ -1)) {
                            ra.field_e.a(((ut) this).field_db[var2].field_b, ((ut) this).field_db[var2].field_a, -8717);
                        }
                    }
                    sm.a(true, param0 + 8029);
                    ((ut) this).field_G.a((kb) (Object) new cs(((ut) this).field_G), 0);
                }
            }
        }
        if (param0 != -1) {
            ((ut) this).field_Y = null;
        }
        ((ut) this).field_ab.field_I = false;
    }

    private final void q(int param0) {
        int var3 = 0;
        fw var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        fw[] var6 = ((ut) this).field_kb;
        fw[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_K = ((ut) this).field_Y == var4 ? true : false;
        }
        if (param0 > -37) {
            ((ut) this).field_nb = true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        pp.field_R[kt.field_p] = param5;
        vt.field_m[kt.field_p] = kt.field_p;
        no.field_U[kt.field_p] = param2;
        if (df.field_T < param2) {
            se.field_e = param2;
        }
        if (param2 < pd.field_e) {
            sq.field_k = param2;
        }
        wp.field_w[kt.field_p] = param3;
        ci.field_c[kt.field_p] = param0;
        pe.field_s[kt.field_p] = param1;
        int var6 = param0 + (param3 + param1);
        int var7 = var6 == 0 ? 0 : 1000 * param3 / var6;
        tb.field_h[kt.field_p] = var7;
        kt.field_p = kt.field_p + 1;
        if (!(sq.field_k <= var7)) {
            sq.field_k = var7;
        }
        if (param4 <= 120) {
            ut.i((byte) 86);
        }
        if (se.field_e < var7) {
            se.field_e = var7;
        }
    }

    final static sc a(bv param0, byte param1, int param2) {
        if (-1 == (param2 ^ -1)) {
            return null;
        }
        if (param1 > -31) {
            return null;
        }
        sc var3 = new sc();
        no.a(param0, (uo) (Object) var3, param2, -24721);
        return var3;
    }

    public static void p(int param0) {
        field_W = null;
        field_ib = null;
        if (param0 != 0) {
            field_fb = -111;
        }
        field_cb = null;
    }

    final static void i(byte param0) {
        int[] var16 = null;
        int[] var13 = null;
        int[] var10 = null;
        int[] var7 = null;
        int[] var4 = null;
        int[] var1 = null;
        int var2 = 0;
        int[] var17 = null;
        int[] var14 = null;
        int[] var11 = null;
        int[] var8 = null;
        int[] var5 = null;
        int[] var18 = null;
        int[] var15 = null;
        int[] var12 = null;
        int[] var9 = null;
        int[] var6 = null;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        mu.field_a = null;
        qc.field_j = 0;
        if (!(!vs.field_j)) {
            rd.field_j = null;
            vs.field_j = false;
            bc.field_a = null;
            ef.b(-1);
        }
        if (!(!pv.field_c)) {
            pq.field_f = null;
            fi.field_u = new at();
            var16 = ei.field_e;
            var13 = var16;
            var10 = var13;
            var7 = var10;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; 8 > var2; var2++) {
                var16[var2] = 0;
            }
            var17 = i.field_Nb;
            var14 = var17;
            var11 = var14;
            var8 = var11;
            var5 = var8;
            var1 = var5;
            for (var2 = 0; var2 < 8; var2++) {
                var17[var2] = 0;
            }
            var18 = rq.field_n;
            var15 = var18;
            var12 = var15;
            var9 = var12;
            var6 = var9;
            var1 = var6;
            for (var2 = 0; 8 > var2; var2++) {
                var18[var2] = 0;
            }
            pv.field_c = false;
        }
        if (!(!cl.field_t)) {
            vh.i((byte) -97);
            pu.d(-112);
            da.c(-120);
            cl.field_t = false;
        }
        if (param0 < 120) {
            ut.a(-43, 103, -36, -123, (byte) 96, -93);
        }
    }

    private final void a(fw param0, byte param1) {
        int var4 = 0;
        ls var5 = null;
        if (param1 != 34) {
            Object var6 = null;
            ((ut) this).a(91, 13, -99, (kb) null);
        }
        ((ut) this).field_Y = param0;
        boolean discarded$0 = param0.a(11, (kb) this);
        fw var3 = this.o(-1);
        ((ut) this).field_ab.field_I = var3 != param0 ? true : false;
        if (((ut) this).field_bb == param0) {
            if (var3 == param0) {
                if (((ut) this).field_lb != null) {
                    var4 = ((ut) this).field_lb.a((byte) 71);
                    var5 = ((ut) this).field_db[var4];
                    if (ra.field_e.field_f == var5.field_b) {
                        // if_icmpne L139
                    } else {
                        ((ut) this).field_ab.field_I = true;
                    }
                }
            }
        }
        this.q(-108);
    }

    private final fw a(byte param0, String param1, qo param2) {
        fw var4 = new fw(param1, param2);
        var4.field_k = (kh) (Object) new nu();
        if (param0 != 38) {
            field_eb = 126;
        }
        int var5 = ((ut) this).field_w - 46;
        var4.a(15, -14 + (((ut) this).field_l + -16), var5, 8192, 30);
        ((ut) this).a((byte) 10, (kb) (Object) var4);
        return var4;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        fw[] var5 = null;
        int var6 = 0;
        fw var7 = null;
        int var8 = 0;
        fw[] var9 = null;
        boolean stackIn_15_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_17_1 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_15_1 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.a(param0, param1, param2, param3);
          if (lk.field_f) {
            param3.f(1);
            var9 = ((ut) this).field_kb;
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (var6 < var9.length) {
                var7 = var9[var6];
                if (var7.field_t) {
                  boolean discarded$1 = var7.a(param0 ^ 32729, (kb) this);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                if (((ut) this).field_hb) {
                  break L0;
                } else {
                  if (nw.g(115)) {
                    break L0;
                  } else {
                    this.n(88);
                    ((ut) this).field_G.a((kb) (Object) new ut(((ut) this).field_G), 0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (((ut) this).field_hb) {
              break L0;
            } else {
              if (nw.g(115)) {
                break L0;
              } else {
                this.n(88);
                ((ut) this).field_G.a((kb) (Object) new ut(((ut) this).field_G), 0);
                break L0;
              }
            }
          }
        }
        L2: {
          if (null == ((ut) this).field_lb) {
            break L2;
          } else {
            L3: {
              stackOut_14_0 = ((ut) this).field_lb.l(11180);
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (((ut) this).field_nb) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L3;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L3;
              }
            }
            if ((stackIn_17_0 ? 1 : 0) != stackIn_17_1) {
              break L2;
            } else {
              this.a(((ut) this).field_bb, (byte) 34);
              ((ut) this).field_nb = ((ut) this).field_lb.l(11180);
              break L2;
            }
          }
        }
    }

    private final void n(int param0) {
        if (param0 < 79) {
            ((ut) this).field_bb = null;
        }
        if (!(((ut) this).field_L)) {
            return;
        }
        ((ut) this).field_L = false;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        fw var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = null;
          if (!((ut) this).field_mb.a(false)) {
            L1: {
              if (((ut) this).field_Z == null) {
                break L1;
              } else {
                if (!((ut) this).field_Z.a(false)) {
                  break L1;
                } else {
                  var5 = ((ut) this).field_Z;
                  break L0;
                }
              }
            }
            if (((ut) this).field_bb.a(false)) {
              var5 = ((ut) this).field_bb;
              break L0;
            } else {
              if (!((ut) this).field_X.a(false)) {
                if (((ut) this).field_ab.a(false)) {
                  var5 = ((ut) this).field_ab;
                  break L0;
                } else {
                  if (((ut) this).field_mb.field_K) {
                    var5 = ((ut) this).field_mb;
                    break L0;
                  } else {
                    L2: {
                      if (null == ((ut) this).field_Z) {
                        break L2;
                      } else {
                        if (((ut) this).field_Z.field_K) {
                          var5 = ((ut) this).field_Z;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (!((ut) this).field_bb.field_K) {
                      break L0;
                    } else {
                      var5 = ((ut) this).field_bb;
                      break L0;
                    }
                  }
                }
              } else {
                var5 = ((ut) this).field_X;
                break L0;
              }
            }
          } else {
            var5 = ((ut) this).field_mb;
            break L0;
          }
        }
        L3: {
          if (param3 == -12215) {
            break L3;
          } else {
            ut.i((byte) 84);
            break L3;
          }
        }
        L4: {
          var6 = param1;
          if (var6 == 96) {
            if (var5 == ((ut) this).field_bb) {
              if (((ut) this).field_Z == null) {
                boolean discarded$13 = ((ut) this).field_mb.a(param3 + 12226, (kb) this);
                return true;
              } else {
                boolean discarded$14 = ((ut) this).field_Z.a(11, (kb) this);
                return true;
              }
            } else {
              if (var5 != ((ut) this).field_Z) {
                if (((ut) this).field_ab == var5) {
                  boolean discarded$15 = ((ut) this).field_X.a(11, (kb) this);
                  return true;
                } else {
                  break L4;
                }
              } else {
                boolean discarded$16 = ((ut) this).field_mb.a(11, (kb) this);
                return true;
              }
            }
          } else {
            if (var6 == -98) {
              if (((ut) this).field_mb != var5) {
                if (((ut) this).field_Z == var5) {
                  boolean discarded$17 = ((ut) this).field_bb.a(11, (kb) this);
                  return true;
                } else {
                  if (var5 != ((ut) this).field_X) {
                    break L4;
                  } else {
                    if (!((ut) this).field_ab.field_I) {
                      break L4;
                    } else {
                      boolean discarded$18 = ((ut) this).field_ab.a(11, (kb) this);
                      return true;
                    }
                  }
                }
              } else {
                L5: {
                  if (((ut) this).field_Z == null) {
                    boolean discarded$19 = ((ut) this).field_bb.a(11, (kb) this);
                    break L5;
                  } else {
                    boolean discarded$20 = ((ut) this).field_Z.a(11, (kb) this);
                    break L5;
                  }
                }
                return true;
              }
            } else {
              if (-99 != var6) {
                if (99 != var6) {
                  break L4;
                } else {
                  L6: {
                    if (((ut) this).field_mb == var5) {
                      break L6;
                    } else {
                      if (((ut) this).field_Z != var5) {
                        if (var5 != ((ut) this).field_bb) {
                          break L4;
                        } else {
                          L7: {
                            if (!((ut) this).field_ab.field_I) {
                              boolean discarded$21 = ((ut) this).field_X.a(param3 ^ -12222, (kb) this);
                              break L7;
                            } else {
                              boolean discarded$22 = ((ut) this).field_ab.a(11, (kb) this);
                              break L7;
                            }
                          }
                          return true;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  boolean discarded$23 = ((ut) this).field_X.a(11, (kb) this);
                  return true;
                }
              } else {
                if (var5 != ((ut) this).field_X) {
                  if (((ut) this).field_ab == var5) {
                    boolean discarded$24 = ((ut) this).field_bb.a(param3 + 12226, (kb) this);
                    return true;
                  } else {
                    return this.a(param0, param1, param2, -12215);
                  }
                } else {
                  boolean discarded$25 = ((ut) this).field_mb.a(11, (kb) this);
                  return true;
                }
              }
            }
          }
        }
        return this.a(param0, param1, param2, -12215);
    }

    private final fw a(qo param0, String param1, ru[] param2, boolean param3) {
        fw var5 = new fw(param1, param0);
        var5.field_k = (kh) (Object) new ps(param2);
        if (param3) {
            field_W = null;
        }
        ob var6 = ((ut) this).field_gb;
        fw var7 = var5;
        var6.a((kb) (Object) var7, var6.field_Q, 0);
        ((ut) this).field_gb.e(0);
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "Most cruel";
        field_W = new byte[1000][];
        field_fb = -1;
        field_cb = new String[]{"Barbarians believe staunchly that magic is a gift from the gods. They will attempt to destroy any that believe otherwise. Being barbarians, they will also destroy anyone that looks at them funny, or spills their mead.", "The beloved of Armadyl, god of the skies, the aviansie are an honourable race of birdmen. Their ability to fly giving them a great advantage on the battlefield.", "How the lower simian races attained sentience is unknown, though the monkey god, Marimbo, probably had something to do with it. ", "When foes refuse to get close enough for the barbarians to destroy them face to face, their women throw sharp sticks at the enemy until the situation resolves itself one way or the other.", "Once the King Black Dragon has joined the fight, the door is opened for his relatives to enter the battlefield behind him.", "The TzHaar are a race of creatures born of the volcano, made of rock and fire. They are a lumbering but honourable people; anger one and it will not soon forget. The TzHaar-Ket, members of the warrior caste, make formidable opponents.", "Ancient creatures of the deep, dagannoths are smarter and stronger than they might first appear. Their true numbers are hidden by the underwater abyss. ", "Creating a teleportation node is no easy feat, and there are few wizards in Gielinor who have the ability to do so. Any faction who has portal mages on their side will have a distinct advantage over their enemies.", "Priestly knights, paladins are both great warriors and devout believers. They take their godly duties as seriously as their combat training.", "The wise and ever-watchful owl reflects perfectly the qualities of Saradomin.", "Monks may not be renowned warriors, but their faith gives them another kind of strength.", "The various mages and wizards who follow Saradomin are well-practised in the magic arts.", "Upholders of peace and guardians of what is now Falador, the organisation known as the White Knights boasts many strong and honourable warriors.", "Proud and noble creatures renowned for their curative powers, though a unicorn’s horn can also do plenty of damage.", "Centaurs are mystical creatures not often seen in the world. The lower half of their bodies is that of a horse; the upper half is that of a man. They are considered expert bowmen.", "The princely lions exude grace and power, which is part of what makes them royalty among the big cats.", "The rangers who fight for Saradomin loose arrows with unerring accuracy, in part due to their frequent prayers.", "Priests are the most devout followers of Saradomin, devoting their lives to prayer, and spreading his divine message. This gives them a strong link to their god, and grants them the ability to create spiritual wards and protections.", "Proud and loyal warriors of Saradomin, the icyene have a godly strength flowing through their veins, and beautiful wings that grant them the power of flight.", "Werewolves have two faces: one is that of a man, albeit a hairy one; the other is that of a wolf man, a savage beast with an insatiable hunger for meat.", "The remains of the fallen dead from centuries-old battles, imbued with dark energy by a necromancer to create terrifying and deadly warriors.", "Necromancers are mages with power over death. Their magics allow them to raise and control armies of undead creatures.", "Not as well-schooled as Saradomin mages, but no less deadly, the Zamorak mages have turned to the forgotten, darker arts to gain their power.", "The Black Knights, also known as the Kinshra, were once allied to the White Knights, but theological differences caused a rift between the two organisations.", "Demons possess incredible power and capability for destruction.", "Zamorakians will use any tricks they can to increase their chances of winning a fight, and the benefits of deploying ranged units are not lost on them. Their rangers are the equal of any fielded by Saradominist forces.", "Servants of the demon lords, hellhounds are dispatched by their masters to claim the lives of the cursed. Being demonkind, though, they don't always like to wait for the slow hand of fate to play its part.", "Sea slugs have the ability to take over and control a host body through which to act out their will, with the ultimate aim of achieving total domination of all other races on Gielinor. To this end, they strive to cause as much chaos and strife as possible through the act of war.", "These magically animated stone statues are particularly difficult to kill and are rarely friendly.", "Pyrelords may only be low demons, but as creatures of ever-burning flame with pyromaniacal leanings, they are dangerous beings. They have the ability to burn down forests.", "To compensate for their small stature, gnomes have taken to training the beasts of Gielinor to aid them in combat. The terrorbird is the ideal creature for a mounted or shock unit, granting their riders great speed, and striking fear into enemies with their shrill cries.", "Wolves are noble creatures of the earth that can be fearsome, but once their trust is earned they become faithful and steadfast allies.", "Druids form the bulk of the human followers of Guthix. They aim to live a life of balance, both taking from and giving to the land. In desperate times, they will fight to maintain balance in the world. The druids' knowledge of herbs grants them the ability to heal other units.", "The Black Guard are an organised dwarven militia, tasked with policing dwarf settlements when not engaged in combat. The Black Guard are typically responsible for manning dwarf multicannons.", "A truly impressive feat of dwarven engineering, the multicannon is an extremely powerful and surprisingly mobile weapon that can fire heavy steel cannonballs accurately over great distances. When deployed this cannon deals fire damage, and as such can use the same fire weapons as a dragon.", "One of Gielinor's elemental giants, moss giants are essentially walking piles of moss. It has been suggested that all moss giants' beards (also made of moss) are entities separate from the giants themselves.", "The Void Knights are the fighting force of the human followers of Guthix. Working mostly in secret, they exist to make decisive strikes against any foe who seeks to unbalance the world. For centuries, they have been fighting a secret war against an invading force of extra-dimensional pests.", "Where the terrorbird gives the gnomes speed, the battle tortoise gives them strength. Typically, three gnomes – a rider, a mage and a ranger – will ride atop the shell of one of these giant tortoises to create a formidable combat unit.", "Gnomes do not rely only on animals to enhance their combat effectiveness, and with the invention of ‘copters have gained a significant height advantage.", "Jade vines are typical plants in that they exist only to grow, but they are atypical in that they grow with extraordinary speed and ferocity, and have limited awareness and a sense of self-preservation.", "Ents are trees so old they have gained sentience, and now roam the woodlands and forests of Gielinor, protecting and nurturing them.", "Falcons are the ideal bird for carrying messages through the dense forests of Isafdar, as well as being a useful flying skirmish unit.", "The black bear is stronger than its brown cousins found in the east, and will not think twice before mauling unsuspecting explorers who encroach on their territory. ", "The crystals that elves use in almost every aspect of their lives are given shape by singing to them, which makes songstresses very important elves. Elven weapons are also formed in this way, and when a songstress sings in battle she can boost the effectiveness of her allies, and even increase the morale of non-elf units.", "Shieldmaidens wield crystal shields, often with a dagger or small sword, which they use to protect elf pikemen and archers. Crystal shields can soak up a lot of damage, giving the shieldmaiden's brethren an opportunity to triumph.", "Grenwalls are odd creatures, and natural predators of the timid pawya. They have the ability to fire their spines like miniature arrows, a weapon they use to strike their pawya prey before it can burrow to safety.", "Dire wolves are larger and meaner than the grey and white wolves that commonly fall under Guthix's banner. They show no loyalty to anything other than their packs, and will defend their territory without mercy.", "Foot soldiers of the elf army, these pikemen wield a large-bladed crystal halberd and wear strong yet lightweight armour. Pikemen are well-trained and formidable soldiers.", "Elf archers wield crystal weaponry in the form of a longbow. This crystal bow does not require conventional arrows, but rather creates enchanted arrows of light. This allows the elves to rain death upon their foes with little need for resupply.", "Even the higher echelons of elf society will engage in war when necessary. Although they are born into a higher station, they spend as much time learning the art of warfare as their subordinates, if not more.", "Female elves take an active part in all aspects of elf society, including hunting and war. They may not favour the heavier weapons used by an elf lord, but they are formidable warriors.", "Crystalline shape-shifters are stealthy creatures. They have the ability to teleport over short distances, often right next to you. They can even teleport into the space you are standing in, killing you in the process.", "Goblins live for war. They are not blessed with much intelligence, but great numbers of them can overwhelm their enemies.", "Goblin religion is very basic – 'Do what you're told on pain of death' – so the role of priest is quite a straightforward one. This doesn't stop goblin priests from becoming strong warriors and accomplished spellcasters, focusing on magics that strengthen their allies and weaken their enemies.", "Even by comparison with the other followers of Bandos ogres are stupid, but they have a stronger sense of community than their green-skinned brethren. Ogres are big, hulking and immensely strong creatures.", "A breed of ogre adapted to living in the jungle, jogres have tough hides to help them resist the poisons of jungle spiders, and to protect them from the bites of insects.", "Mogres have developed the ability to breathe underwater, and now prefer to live in marine environments. They have retained the ability to breathe on land, however, and are no less deadly when they do come to the surface.", "The hobgoblin occupies the rung on the evolutionary ladder between goblin and ork, and so display the best and worst traits of both races.", "Ogre shamans are among the most powerful magic users in all of Gielinor. One of their nastier spells creates a thick, black smog in which other Bandosian units thrive.", "Related to hill giants, cyclopes are distinguished by having just one eye in the middle of their faces, and some even have horns on their heads. Their gaze can be quite entrancing, so it is best not to look them in the eye. What they lack in depth-perception they make up for in club-swinging.", "Larger, stronger, faster and ever-so-slightly smarter than goblins, the ork is the staple soldier of any Bandosian army. Although they lack general intelligence, they have grasped the basic principles of tactical combat.", "Ogre men are bad enough, but their female counterparts are stronger still. They're also ravenous, and will eat anything or anyone that gets in their way.", "Ourgs are giant creatures with incredible strength and power - enough to bring even a mountain down to size - and their size alone will scare off most enemies. There are few ourgs in the ranks of Bandos's armies, so they tend to hold positions of command.", "The Kalphite Queen rules over the rest of her hive. A hive mind has great strength, and unwary warriors can be overwhelmed by her workers, soldiers and guardians as they swarm to and cover the area around her.", "Creatures that thrive in the harsh desert are typically scavengers, and jackals are a prime example of this. They are often found in the outskirts of desert cities, living off the scraps left by the city's inhabitants.", "A mummy is the animated remains of a Menaphite who has been entombed in the proper ceremonial manner. The body's owner has long since departed for the afterlife, but the mummy carries on, protecting the burial places of the dead from grave-robbers.", "Locusts are as deadly and pitiless as the desert itself, and swarms of these creatures have the ability to completely destroy crops in a very short space of time. Some have even been known to grow to the size of a small camel.", "The Bedabin are a nomadic people, travelling through the desert and surviving on what little it provides. This tough lifestyle has made them a hardy people. They also possess the secret of making darts, a deadly thrown weapon.", "The desert town of Pollnivneach has the tendency to attract the worst elements of society, not least of which are the thuggish thieves from Menaphos. They'll not give a second thought to taking a cosh to the back of your head, and stealing all your worldly goods.", "These warriors are devout followers of Icthlarin, god of life and death. Icthlarin is worshipped both for caring for the living and for guiding the dead to the afterlife. His warriors uphold their god's values, and take their ceremonial duties particularly seriously.", "All along the banks of the River Elid, and in the swamplands to the desert's south-east, you will find crocodiles basking in the hot sun of the Kharidian Desert. Don't be fooled by their placid demeanour, though: if you get too close they'll take a bite out of you.", "The followers of the lesser desert god Scabaras long ago twisted their form to become insect-like in appearance. They have a preference for isolation, but still know how to handle unwanted company.", "Sphinxes are strange, chimeric creatures that speak in riddles, which allows them to beguile any enemy units that get close enough to hear them.", "These are elementals of Elidinis, the desert goddess of water. They have the ability to create water, which allows them to maintain the River Elid, among other things.", "King of the dragons, this three-headed, black-skinned beast has the ability to breathe fire, and it's many heads allow it two attacks per turn. Not many dragonslayers are hardy enough to survive an attack from this creature, and the second can be devastating."};
    }
}
