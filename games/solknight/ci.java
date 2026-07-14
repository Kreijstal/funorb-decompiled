/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ci extends gf implements ka {
    static String[] field_mb;
    static int field_jb;
    static int field_sb;
    static String[] field_gb;
    private boolean field_lb;
    static int field_ib;
    private mg field_nb;
    private boolean field_rb;
    static int[] field_pb;
    private c field_kb;
    private boolean field_ob;
    static int[] field_qb;
    private boolean field_hb;

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        if (param4 > 121) {
          L0: {
            var5 = param3 + param0;
            var6 = param1 + param2;
            if (mi.field_b < param3) {
              stackOut_4_0 = param3;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = mi.field_b;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (param1 <= mi.field_l) {
              stackOut_7_0 = mi.field_l;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (var5 >= mi.field_k) {
              stackOut_10_0 = mi.field_k;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = var5;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (var6 < mi.field_e) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = mi.field_e;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_14_0;
            if (param3 < mi.field_b) {
              break L4;
            } else {
              if (mi.field_k > param3) {
                var11 = param3 + mi.field_a * var8;
                var12 = -var8 + var10 + 1 >> -1679159263;
                L5: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    mi.field_f[var11] = 16777215;
                    var11 = var11 + mi.field_a * 2;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L6: {
            if (mi.field_l > param1) {
              break L6;
            } else {
              if (var6 < mi.field_e) {
                var11 = var7 + mi.field_a * param1;
                var12 = 1 - -var9 - var7 >> -442165791;
                L7: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L6;
                  } else {
                    mi.field_f[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (var5 < mi.field_b) {
              break L8;
            } else {
              if (var5 < mi.field_k) {
                var11 = var5 + mi.field_a * (var8 - -(1 & -param3 + var5));
                var12 = 1 - (-var10 - -var8) >> -1126923231;
                L9: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L8;
                  } else {
                    mi.field_f[var11] = 16777215;
                    var11 = var11 + 2 * mi.field_a;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L10: {
            if (mi.field_l > param1) {
              break L10;
            } else {
              if (mi.field_e > var6) {
                var11 = (1 & var6 + -param1) + (var7 + var6 * mi.field_a);
                var12 = var9 + (1 - var7) >> 292616513;
                L11: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L10;
                  } else {
                    mi.field_f[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void m(int param0) {
        ((ci) this).field_kb.a((byte) -128, 4210752, 2121792);
        lj var2 = new lj((ci) this, ((ci) this).field_nb, pc.field_a);
        if (param0 <= 118) {
            ((ci) this).field_nb = null;
        }
        var2.a(15, kf.field_F, 1);
        ((ci) this).c(-3399, (rc) (Object) var2);
    }

    public static void g(byte param0) {
        field_qb = null;
        field_pb = null;
        field_gb = null;
        int var1 = -57 / ((2 - param0) / 35);
        field_mb = null;
    }

    final void f(boolean param0) {
        if (!((ci) this).field_J) {
            return;
        }
        ((ci) this).field_J = false;
        if (!((ci) this).field_ob) {
            // ifeq L43
            ie.b(-102);
        } else {
            fj.a((byte) 85);
        }
        if (!param0) {
            Object var3 = null;
            ci.a(47, true, 62, (aa) null, true);
        }
    }

    ci(i param0, mg param1, String param2, boolean param3, boolean param4) {
        super(param0, (rc) (Object) new lj((ci) null, param1, param2), 77, 10, 10);
        ((ci) this).field_lb = false;
        ((ci) this).field_ob = param3 ? true : false;
        ((ci) this).field_hb = false;
        ((ci) this).field_nb = param1;
        ((ci) this).field_rb = param4 ? true : false;
        ((ci) this).field_kb = new c(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ci) this).field_kb.field_B = true;
        ((ci) this).a((rc) (Object) ((ci) this).field_kb, 5411);
    }

    public void a(int param0, int param1, int param2, pj param3, boolean param4) {
        if (((ci) this).field_lb) {
            h.a(3, true);
            ((ci) this).f(true);
        } else {
            kj.a(ia.g(97), 108, "tochangedisplayname.ws");
        }
        if (!param4) {
            field_gb = null;
        }
    }

    final static void a(byte[] param0, int param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, gb param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = SolKnight.field_L ? 1 : 0;
          var7 = ah.a(param1, (byte) -122);
          if (null != f.field_e) {
            break L0;
          } else {
            f.field_e = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            L2: {
              L3: {
                if (lc.field_k == null) {
                  break L3;
                } else {
                  if (var7 <= lc.field_k.field_l.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              lc.field_k = new gb(var7);
              break L2;
            }
            L4: {
              L5: {
                lc.field_k.field_m = 0;
                lc.field_k.a(param2, param1, param0, param4);
                lc.field_k.b((byte) -65, var7);
                lc.field_k.a((byte) 97, var15);
                if (null == ee.field_h) {
                  break L5;
                } else {
                  if (-101 < (ee.field_h.field_l.length ^ -1)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              ee.field_h = new gb(100);
              break L4;
            }
            ee.field_h.field_m = 0;
            ee.field_h.c(19, 10);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (-5 >= (var11 ^ -1)) {
                ee.field_h.a(true, param1);
                ee.field_h.a(param5, 59769888, param3);
                param6.a(8, ee.field_h.field_m, ee.field_h.field_l, 0);
                param6.a(param2 ^ 0, lc.field_k.field_m, lc.field_k.field_l, 0);
                return;
              } else {
                ee.field_h.b(var15[var11], false);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = f.field_e.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static void a(da param0, boolean param1, da param2, da param3) {
        int var8 = 0;
        int var9 = 0;
        od[] var15 = null;
        int var11_int = 0;
        int var13 = SolKnight.field_L ? 1 : 0;
        fi.field_a = ik.a(param3, -18362, "frame_top", "commonui");
        qk.field_l = ik.a(param3, -18362, "frame_bottom", "commonui");
        fa.field_b = rb.a("jagex_logo_grey", "commonui", param3, (byte) -125);
        vk.field_i = ik.a(param3, -18362, "button", "commonui");
        gb.field_k = nh.a(param3, "validation", 0, "commonui");
        jh.field_g = (mg) (Object) si.a(param0, "commonui", !param1 ? true : false, "arezzo12", param3);
        ua.field_G = (mg) (Object) si.a(param0, "commonui", !param1 ? true : false, "arezzo14", param3);
        uc.field_g = (mg) (Object) si.a(param0, "commonui", true, "arezzo14bold", param3);
        o var18 = new o(param2.a(4, "button.gif", ""), (java.awt.Component) (Object) dc.field_q);
        od discarded$0 = ve.a(param3, -97, "dropdown", "commonui");
        od[] var5 = dj.a(8108, "screen_options", param3, "commonui");
        md.field_s = new od[4];
        r.field_i = new od[4];
        jl.field_g = new od[4];
        od[][] var6 = new od[][]{md.field_s, r.field_i, jl.field_g};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_m;
        for (var8 = 1; var8 < var22.length; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_n[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            od[] var10 = var15;
            for (var11_int = 0; var15.length > var11_int; var11_int++) {
                var15[var11_int] = bl.a(var5[var9], var22[var11_int], (byte) 100);
            }
        }
        if (param1) {
            Object var14 = null;
            ci.a((da) null, false, (da) null, (da) null);
        }
        var9 = var18.field_t;
        fl.b((byte) 91);
        var18.a();
        mi.c(0, 0, mi.field_a, mi.field_d);
        o var16 = new o(var9, var9);
        o var19 = var16;
        var19.a();
        var18.c(0, 0);
        o var11 = new o(var9, var9);
        var11.a();
        var18.c(var9 + -var18.field_p, 0);
        o var12 = new o(-(var9 * 2) + var18.field_p, var9);
        var12.a();
        var18.c(-var9, 0);
        mf.e(4096);
        vk.field_i = new o[]{var16, var12, var11};
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 60 % ((31 - param1) / 56);
        if (param2 == 13) {
            ((ci) this).f(true);
            return true;
        }
        return super.a(param0, (byte) 90, param2, param3);
    }

    final static void a(byte param0, int param1) {
        int var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= -26) {
            return;
        }
        ob var4 = (ob) (Object) he.field_d.a((byte) 51);
        while (var4 != null) {
            vg.a(param1, var4, 118);
            var4 = (ob) (Object) he.field_d.b(-84);
        }
        gg var2 = bc.field_J.a((byte) 51);
        while (var2 != null) {
            wi.c(1, param1);
            var2 = bc.field_J.b(-104);
        }
    }

    final static String a(CharSequence[] param0, byte param1) {
        if (param1 > -61) {
            return null;
        }
        return la.a(125, 0, param0.length, param0);
    }

    final static void a(int param0, boolean param1, int param2, aa param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          ed.field_a[0] = ib.field_i.nextInt();
          ed.field_a[1] = ib.field_i.nextInt();
          ed.field_a[2] = (int)(i.field_H >> -898666784);
          ic.field_z.field_m = 0;
          ed.field_a[3] = (int)i.field_H;
          ic.field_z.b(ed.field_a[0], false);
          ic.field_z.b(ed.field_a[1], false);
          ic.field_z.b(ed.field_a[2], false);
          ic.field_z.b(ed.field_a[3], false);
          vh.a(ic.field_z, 107);
          ic.field_z.a(true, param2);
          param3.a(-12518, ic.field_z);
          id.field_c.field_m = 0;
          if (param1) {
            id.field_c.c(param0 ^ -25840, 18);
            break L0;
          } else {
            id.field_c.c(param0 ^ 25812, 16);
            break L0;
          }
        }
        L1: {
          id.field_c.field_m = id.field_c.field_m + 2;
          var5 = id.field_c.field_m;
          id.field_c.b(al.field_n, false);
          id.field_c.a(wk.field_b, (byte) 63);
          var6 = 0;
          if (!cl.field_m) {
            break L1;
          } else {
            var6 = var6 | 1;
            break L1;
          }
        }
        L2: {
          if (!b.field_b) {
            break L2;
          } else {
            var6 = var6 | 4;
            break L2;
          }
        }
        L3: {
          if (!param4) {
            break L3;
          } else {
            var6 = var6 | 8;
            break L3;
          }
        }
        L4: {
          if (null == ri.field_a) {
            break L4;
          } else {
            var6 = var6 | 16;
            break L4;
          }
        }
        L5: {
          if (param0 == -25776) {
            break L5;
          } else {
            field_sb = 30;
            break L5;
          }
        }
        L6: {
          id.field_c.c(-110, var6);
          var7 = hh.a(false, ia.g(param0 ^ 25799));
          if (var7 == null) {
            var7 = "";
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          id.field_c.a(var7, 0);
          if (null == ri.field_a) {
            break L7;
          } else {
            id.field_c.b(param0 ^ 1955918408, ri.field_a);
            break L7;
          }
        }
        al.a(ic.field_z, (gb) (Object) id.field_c, (byte) 110, nc.field_d, qa.field_p);
        id.field_c.a(id.field_c.field_m + -var5, true);
        qf.a(0, -1);
    }

    final void a(String param0, int param1, byte param2) {
        lj var4 = null;
        int var5 = 0;
        lj var6 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        lj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        lj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        lj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        lj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        lj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        lj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        if (((ci) this).field_hb) {
          return;
        } else {
          L0: {
            if (param2 <= -40) {
              break L0;
            } else {
              ((ci) this).m(13);
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (param1 != 256) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          L2: {
            ((ci) this).field_lb = stackIn_8_1 != 0;
            ((ci) this).field_hb = true;
            ((ci) this).field_kb.a((byte) -118, 4210752, 8405024);
            var6 = new lj((ci) this, ((ci) this).field_nb, param0);
            var4 = var6;
            if ((param1 ^ -1) == -6) {
              var6.a(11, cl.field_k, 1);
              var6.a(17, ph.field_e, 1);
              break L2;
            } else {
              if ((param1 ^ -1) == -257) {
                pj discarded$2 = var6.a(0, gg.field_c, (dg) this);
                break L2;
              } else {
                L3: {
                  stackOut_10_0 = (lj) var6;
                  stackOut_10_1 = -1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (!((ci) this).field_ob) {
                    stackOut_12_0 = (lj) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = u.field_e;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L3;
                  } else {
                    stackOut_11_0 = (lj) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = gg.field_c;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L3;
                  }
                }
                ((lj) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, 1);
                break L2;
              }
            }
          }
          L4: {
            if ((param1 ^ -1) != -4) {
              if ((param1 ^ -1) == -5) {
                var6.a(8, mf.field_l, 1);
                break L4;
              } else {
                if (param1 != 6) {
                  if ((param1 ^ -1) != -10) {
                    break L4;
                  } else {
                    pj discarded$3 = var6.a(0, gh.field_r, (dg) this);
                    break L4;
                  }
                } else {
                  var6.a(9, ik.field_d, 1);
                  break L4;
                }
              }
            } else {
              var6.a(7, qd.field_a, 1);
              break L4;
            }
          }
          ((ci) this).c(-3399, (rc) (Object) var6);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_gb = new String[]{"Pluto", "Neptune", "Uranus", "Saturn", "Jupiter", "Asteroid Defence Grid", "Mars", "Earth"};
        field_pb = new int[8192];
        field_qb = new int[128];
    }
}
