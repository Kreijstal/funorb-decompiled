/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends oa {
    int field_ab;
    int field_eb;
    static int[] field_db;
    int field_Y;
    static String field_V;
    static String field_Z;
    int field_W;
    int field_bb;
    static boolean field_X;
    int field_cb;

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        double var10 = 0.0;
        int var12 = SteelSentinels.field_G;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        int var8 = -((nl) this).field_cb + (-((nl) this).field_o + (-param2 + param3));
        int var9 = param0 + -((nl) this).field_Y + -((nl) this).field_z + -param4;
        if (var8 * var8 + var9 * var9 >= ((nl) this).field_ab * ((nl) this).field_ab) {
        } else {
            var10 = Math.atan2((double)var9, (double)var8) - mj.field_Xb;
            if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((nl) this).field_bb;
            } else {
                if (!(0.0 >= var10)) {
                    var10 = var10 + 3.141592653589793 / (double)((nl) this).field_bb;
                }
            }
            ((nl) this).field_eb = (int)(var10 * (double)((nl) this).field_bb / 6.283185307179586);
            while (((nl) this).field_eb >= ((nl) this).field_bb) {
                ((nl) this).field_eb = ((nl) this).field_eb - ((nl) this).field_bb;
            }
            while (-1 < (((nl) this).field_eb ^ -1)) {
                ((nl) this).field_eb = ((nl) this).field_eb + ((nl) this).field_bb;
            }
        }
        return true;
    }

    final static boolean g(int param0) {
        int var1 = 0;
        int var2 = SteelSentinels.field_G;
        for (var1 = 0; var1 < ue.field_c.length; var1++) {
            // ifnull L28
        }
        bi.field_f.field_Ub.field_eb = -100 + bi.field_f.field_Lb + -bi.field_f.field_Ub.field_Lb;
        fg.field_Ob = 1;
        va.field_k[0] = bi.field_f.field_Ub.field_eb;
        if (param0 <= 122) {
            return true;
        }
        vn.d(-31);
        if (var1 >= ue.field_c.length) {
            km.field_a = wh.field_i;
            ln.field_c = lj.field_e[0];
            return false;
        }
        uc.field_b = cj.a(73, di.field_c, hl.field_v);
        if (null != ue.field_c[var1]) {
            // if_icmpne L151
        } else {
            ue.field_c[var1] = new int[uc.field_b.length];
        }
        ii.a(uc.field_b, 0, ue.field_c[var1], 0, uc.field_b.length);
        ad.a(var1, hl.field_v, 55);
        return true;
    }

    final static void a(int param0, byte[] param1, boolean param2, int param3, int param4, byte param5) {
        kj var6 = mm.field_g;
        var6.a(param4, (byte) -117);
        if (param5 <= 30) {
            return;
        }
        var6.field_p = var6.field_p + 1;
        int var7 = var6.field_p;
        var6.a((byte) 115, 4);
        var6.a((byte) 119, param0);
        int var8 = param3;
        if (!(!param2)) {
            // wide iinc 8 128
        }
        var6.a((byte) 112, var8);
        var6.a(param1.length, (byte) -122, 0, param1);
        var6.b((byte) -116, var6.field_p - var7);
    }

    public static void f(byte param0) {
        field_db = null;
        field_V = null;
        field_Z = null;
        if (param0 >= -23) {
            wk[] discarded$0 = nl.a(false, 19, true, 116, 99, 62);
        }
    }

    final static wk[] a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        wk var11 = null;
        int[] var12 = null;
        wk var13 = null;
        wk var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = pb.field_g;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = pb.field_c;
          var8 = pb.field_j;
          var9 = new wk(16, param4);
          var9.d();
          pb.e(0, 0, 16, param4, param1, param5);
          var10 = null;
          var11 = null;
          if (!param0) {
            break L0;
          } else {
            var13 = var9.g();
            var10 = var13;
            var13.d();
            pb.g(0, 0, 5, 0);
            pb.g(0, 1, 3, 0);
            pb.g(0, 2, 2, 0);
            pb.g(0, 3, 1, 0);
            pb.g(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          if (param3 < -7) {
            break L1;
          } else {
            field_X = true;
            break L1;
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            var14 = var9.g();
            var11 = var14;
            var14.d();
            pb.g(11, 0, 5, 0);
            pb.g(13, 1, 3, 0);
            pb.g(14, 2, 2, 0);
            pb.g(15, 3, 1, 0);
            pb.g(15, 4, 1, 0);
            break L2;
          }
        }
        pb.a(var18, var7, var8);
        return new wk[]{null, null, null, var10, var9, var11, null, null, null};
    }

    final static void a(byte param0, cm param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pe var5_ref_pe = null;
        int[] var6 = null;
        int var7 = 0;
        kj var8 = null;
        int var9 = 0;
        kj var10 = null;
        var7 = SteelSentinels.field_G;
        var8 = new kj(param1.a("", -742, "logo.fo3d"));
        var10 = var8;
        var3 = var10.f((byte) -119);
        var10.d(false);
        pm.field_W = nm.a(var10, (byte) 87);
        nn.field_h = new pe[var3];
        cl.field_f = new int[var3][];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var10.i((byte) -3);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var9 >= var3) {
                var5 = -123 % ((49 - param0) / 35);
                return;
              } else {
                var5_ref_pe = nn.field_h[var9];
                var5_ref_pe.a(6, 6, 1, 6, 14866);
                var5_ref_pe.b(32767);
                var6 = new int[]{var5_ref_pe.field_J - -var5_ref_pe.field_c >> 93145057, var5_ref_pe.field_p + var5_ref_pe.field_W >> -302557887, var5_ref_pe.field_n + var5_ref_pe.field_s >> 1073563425};
                cl.field_f[var9] = var6;
                var5_ref_pe.a(0, -var6[1], -var6[2], -var6[0]);
                var9++;
                continue L1;
              }
            }
          } else {
            nn.field_h[var4] = ve.a(-100, var8);
            var4++;
            continue L0;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 == 26) {
          var2 = param0;
          if (55 != var2) {
            if (0 != var2) {
              if (-58 != (var2 ^ -1)) {
                if (62 == var2) {
                  return 13;
                } else {
                  if (var2 == 65) {
                    return 16;
                  } else {
                    if (var2 != 69) {
                      if ((var2 ^ -1) != -73) {
                        if (var2 == 75) {
                          return 26;
                        } else {
                          if ((var2 ^ -1) == -80) {
                            return 28;
                          } else {
                            return -1;
                          }
                        }
                      } else {
                        return 23;
                      }
                    } else {
                      return 19;
                    }
                  }
                }
              } else {
                return 5;
              }
            } else {
              return 9;
            }
          } else {
            return 2;
          }
        } else {
          return 14;
        }
    }

    final static int[] a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 > 122) {
          var2 = param0;
          if (0 != var2) {
            if ((var2 ^ -1) != -56) {
              if (57 != var2) {
                if (var2 != -63) {
                  if (-66 != var2) {
                    if (var2 == 69) {
                      return ua.field_O;
                    } else {
                      if (var2 != 72) {
                        if (var2 != 75) {
                          if (79 == var2) {
                            return ua.field_E;
                          } else {
                            if (84 == var2) {
                              return vk.field_s;
                            } else {
                              if (88 == var2) {
                                return jm.field_p;
                              } else {
                                if (92 == var2) {
                                  return si.field_k;
                                } else {
                                  return null;
                                }
                              }
                            }
                          }
                        } else {
                          return ua.field_J;
                        }
                      } else {
                        return ua.field_D;
                      }
                    }
                  } else {
                    return ua.field_N;
                  }
                } else {
                  return ua.field_z;
                }
              } else {
                return ua.field_P;
              }
            } else {
              return ua.field_x;
            }
          } else {
            return ua.field_v;
          }
        } else {
          return null;
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        ah var7 = null;
        ah var8 = null;
        kj var9 = null;
        CharSequence var10 = null;
        var6 = SteelSentinels.field_G;
        var10 = (CharSequence) (Object) param0;
        if (!fa.a(param2, var10)) {
          return en.field_a;
        } else {
          if (2 != qc.field_P) {
            return ug.field_N;
          } else {
            var8 = wi.a(param0, (byte) 113);
            if (var8 == null) {
              return db.a(bd.field_a, -75, new String[1]);
            } else {
              ck discarded$2 = ea.field_c.a((byte) 125, (ck) (Object) var8);
              L0: while (true) {
                var7 = (ah) (Object) ea.field_c.a((byte) -102);
                if (var7 != null) {
                  var7.field_bc = var7.field_bc - 1;
                  continue L0;
                } else {
                  var8.b(4);
                  var8.e(480);
                  vd.field_h = vd.field_h - 1;
                  var9 = mm.field_g;
                  var9.a(param1, (byte) -117);
                  var9.field_p = var9.field_p + 1;
                  var5 = var9.field_p;
                  var9.a((byte) 110, 1);
                  var9.a(param0, -61);
                  var9.b((byte) -53, -var5 + var9.field_p);
                  return null;
                }
              }
            }
          }
        }
    }

    private nl() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, int param2) {
        hk var6 = null;
        hk var7 = null;
        kj var4 = null;
        if (param2 != 5) {
            field_V = null;
        }
        if (bj.field_j != param0) {
            var6 = (hk) (Object) fm.field_a.a((long)bj.field_j, (byte) 92);
            var7 = var6;
            if (!(var7 == null)) {
                var7.field_hc = null;
            }
            bj.field_j = param0;
            var4 = mm.field_g;
            var4.a(param1, (byte) -117);
            var4.a((byte) 108, 3);
            var4.a((byte) 113, 11);
            var4.d(param0, 21);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        field_V = "On";
        field_Z = "Accept unrated rematch";
    }
}
