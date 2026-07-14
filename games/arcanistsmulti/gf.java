/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ob implements vb {
    private ag field_lb;
    private ag field_kb;
    static String field_jb;
    static String field_V;

    final static void a(ll[] param0, boolean param1, byte param2, eg param3, byte[] param4, String[][] param5, byte[] param6, eg param7, int param8, eg param9, int[] param10, int param11, int param12, qb[][] param13, qb[][] param14, String[] param15, String[] param16, int[] param17, String[][] param18) {
        if (param2 < 36) {
            int discarded$0 = gf.a(83, (byte) 102, 89, -126);
        }
        Object var20 = null;
        gd.a(param10, param0, param14, param12, param5, param15, param8, param9, param4, (String[]) null, param7, param16, 17292, param13, param1, 1, param18, param3, param6, param17);
    }

    gf(h param0) {
        super(param0, 200, 130);
        qm var2 = new qm(oc.field_d, (wc) null);
        var2.field_j = 50;
        var2.field_v = ((gf) this).field_v;
        var2.field_k = 80;
        var2.field_n = 0;
        var2.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((gf) this).c(-107, var2);
        if (lc.a((byte) 112)) {
            ((gf) this).field_lb = this.a((byte) 103, la.field_e, (wc) this);
        }
        ((gf) this).field_kb = this.a((byte) 103, dd.field_e, (wc) this);
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = -89 / ((param1 - -69) / 41);
        var5 = -param0 + 1024;
        var6 = (var5 * (param2 >> -1891739344 & 255) - -(((param3 & 16748890) >> -728994576) * param0)) / 1024;
        if (-1 < (var6 ^ -1)) {
          var6 = 0;
          var7 = (((65292 & param3) >> -506398168) * param0 + var5 * (255 & param2 >> 1420824136)) / 1024;
          if (-1 >= (var7 ^ -1)) {
            L0: {
              if (255 >= var7) {
                break L0;
              } else {
                var7 = 255;
                break L0;
              }
            }
            var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
            if (-1 >= (var8 ^ -1)) {
              if (var8 <= 255) {
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              } else {
                var8 = 255;
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              }
            } else {
              var8 = 0;
              return var8 | (var7 << -890153208 | var6 << -1515314416);
            }
          } else {
            var7 = 0;
            var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
            if (-1 >= (var8 ^ -1)) {
              if (var8 <= 255) {
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              } else {
                var8 = 255;
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              }
            } else {
              var8 = 0;
              return var8 | (var7 << -890153208 | var6 << -1515314416);
            }
          }
        } else {
          if ((var6 ^ -1) < -256) {
            var6 = 255;
            var7 = (((65292 & param3) >> -506398168) * param0 + var5 * (255 & param2 >> 1420824136)) / 1024;
            if (-1 >= (var7 ^ -1)) {
              L1: {
                if (255 >= var7) {
                  break L1;
                } else {
                  var7 = 255;
                  break L1;
                }
              }
              var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
              if (-1 >= (var8 ^ -1)) {
                if (var8 <= 255) {
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                } else {
                  var8 = 255;
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                }
              } else {
                var8 = 0;
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              }
            } else {
              var7 = 0;
              var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
              if (-1 >= (var8 ^ -1)) {
                if (var8 <= 255) {
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                } else {
                  var8 = 255;
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                }
              } else {
                var8 = 0;
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              }
            }
          } else {
            var7 = (((65292 & param3) >> -506398168) * param0 + var5 * (255 & param2 >> 1420824136)) / 1024;
            if (-1 >= (var7 ^ -1)) {
              L2: {
                if (255 >= var7) {
                  break L2;
                } else {
                  var7 = 255;
                  break L2;
                }
              }
              var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
              if (-1 >= (var8 ^ -1)) {
                if (var8 <= 255) {
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                } else {
                  var8 = 255;
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                }
              } else {
                var8 = 0;
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              }
            } else {
              var7 = 0;
              var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
              if (-1 >= (var8 ^ -1)) {
                if (var8 <= 255) {
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                } else {
                  var8 = 255;
                  return var8 | (var7 << -890153208 | var6 << -1515314416);
                }
              } else {
                var8 = 0;
                return var8 | (var7 << -890153208 | var6 << -1515314416);
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param1 == -266740663) {
          if (65536L > (long)param0) {
            if (-257L < ((long)param0 ^ -1L)) {
              if (-1 < (param0 ^ -1)) {
                return -1;
              } else {
                return gj.field_g[param0] >> 1977429836;
              }
            } else {
              if (((long)param0 ^ -1L) > -4097L) {
                if (-1025L >= ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> 465948100] >> -1759452566;
                } else {
                  return gj.field_g[param0 >> 1115198690] >> 1950075307;
                }
              } else {
                if (((long)param0 ^ -1L) > -16385L) {
                  return gj.field_g[param0 >> -1227913274] >> -266740663;
                } else {
                  return gj.field_g[param0 >> -931946168] >> -2014390264;
                }
              }
            }
          } else {
            if (((long)param0 ^ -1L) > -16777217L) {
              if (1048576L > (long)param0) {
                if (-262145L < ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> 783611530] >> -422499417;
                } else {
                  return gj.field_g[param0 >> 1927012204] >> -1970051418;
                }
              } else {
                if (-4194305L < ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> 1840697646] >> -249477851;
                } else {
                  return gj.field_g[param0 >> 1908076368] >> 1016932068;
                }
              }
            } else {
              if (((long)param0 ^ -1L) <= -268435457L) {
                if (((long)param0 ^ -1L) <= -1073741825L) {
                  return gj.field_g[param0 >> -1803282824];
                } else {
                  return gj.field_g[param0 >> -65061226] >> -2077407583;
                }
              } else {
                if (-67108865L < ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> -1073258126] >> -919155581;
                } else {
                  return gj.field_g[param0 >> 1867986996] >> 2095823618;
                }
              }
            }
          }
        } else {
          field_jb = null;
          if (65536L > (long)param0) {
            if (-257L < ((long)param0 ^ -1L)) {
              if (-1 >= (param0 ^ -1)) {
                return gj.field_g[param0] >> 1977429836;
              } else {
                return -1;
              }
            } else {
              if (((long)param0 ^ -1L) > -4097L) {
                if (-1025L < ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> 1115198690] >> 1950075307;
                } else {
                  return gj.field_g[param0 >> 465948100] >> -1759452566;
                }
              } else {
                if (((long)param0 ^ -1L) <= -16385L) {
                  return gj.field_g[param0 >> -931946168] >> -2014390264;
                } else {
                  return gj.field_g[param0 >> -1227913274] >> -266740663;
                }
              }
            }
          } else {
            if (((long)param0 ^ -1L) > -16777217L) {
              if (1048576L > (long)param0) {
                if (-262145L >= ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> 1927012204] >> -1970051418;
                } else {
                  return gj.field_g[param0 >> 783611530] >> -422499417;
                }
              } else {
                if (-4194305L >= ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> 1908076368] >> 1016932068;
                } else {
                  return gj.field_g[param0 >> 1840697646] >> -249477851;
                }
              }
            } else {
              if (((long)param0 ^ -1L) <= -268435457L) {
                if (((long)param0 ^ -1L) > -1073741825L) {
                  return gj.field_g[param0 >> -65061226] >> -2077407583;
                } else {
                  return gj.field_g[param0 >> -1803282824];
                }
              } else {
                if (-67108865L < ((long)param0 ^ -1L)) {
                  return gj.field_g[param0 >> -1073258126] >> -919155581;
                } else {
                  return gj.field_g[param0 >> 1867986996] >> 2095823618;
                }
              }
            }
          }
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        if (-99 == (param3 ^ -1)) {
          if (((gf) this).field_lb == null) {
            boolean discarded$6 = ((gf) this).field_kb.a(0, (qm) this);
            return true;
          } else {
            boolean discarded$7 = ((gf) this).field_lb.a(0, (qm) this);
            return true;
          }
        } else {
          if (param3 == 99) {
            boolean discarded$8 = ((gf) this).field_kb.a(0, (qm) this);
            return true;
          } else {
            if (param1 > -120) {
              return true;
            } else {
              return this.a(param0, (byte) -126, param2, param3);
            }
          }
        }
    }

    final static void a(byte param0, eg param1) {
        Object var4 = null;
        kc var6 = null;
        kc var7 = null;
        kc var11 = null;
        kc var12 = null;
        kc var13 = null;
        eb.field_d = fj.a("basic", param0 ^ -22556, param1, "display_name_changed");
        nl.field_Gb = new hb(0L, oh.field_r, ln.field_T, vk.field_z);
        dd.field_c = new hb(0L, oh.field_r, dm.field_I, wl.field_M);
        ec.field_d = new kc(0L, (kc) null);
        lj.field_j = new kc(0L, pg.field_c);
        lj.field_j.field_X = 1;
        p.field_d = new kc(0L, vf.field_u, hb.field_Bb);
        nk.field_n = new kc(0L, vf.field_i, hc.field_d);
        cc.field_a = new kc(0L, nj.field_d);
        ec.field_d.a(lj.field_j, 106);
        ec.field_d.a(p.field_d, param0 + 14);
        ec.field_d.a(nk.field_n, 8);
        ec.field_d.a((kc) (Object) nl.field_Gb, param0 + -61);
        ec.field_d.a(cc.field_a, 85);
        if (param0 != 72) {
          var4 = null;
          gf.a((byte) 119, (eg) null);
          nl.field_Gb.field_Db.field_Hb.a(pg.field_c, (byte) 127);
          nl.field_Gb.field_Db.field_Hb.field_gb = 1;
          var6 = nl.field_Gb.field_Db.field_Hb;
          var7 = var6;
          var6 = var7;
          var7.field_X = 1;
          dd.field_c.field_Db.field_Hb.a(pg.field_c, (byte) 114);
          var13 = dd.field_c.field_Db.field_Hb;
          dd.field_c.field_Db.field_Hb.field_gb = 1;
          var13.field_X = 1;
          return;
        } else {
          nl.field_Gb.field_Db.field_Hb.a(pg.field_c, (byte) 127);
          nl.field_Gb.field_Db.field_Hb.field_gb = 1;
          var6 = nl.field_Gb.field_Db.field_Hb;
          var11 = var6;
          var11.field_X = 1;
          dd.field_c.field_Db.field_Hb.a(pg.field_c, (byte) 114);
          var12 = dd.field_c.field_Db.field_Hb;
          dd.field_c.field_Db.field_Hb.field_gb = 1;
          var12.field_X = 1;
          return;
        }
    }

    private final void g(int param0) {
        if (param0 >= 30) {
          if (!((gf) this).field_G) {
            return;
          } else {
            ((gf) this).field_G = false;
            return;
          }
        } else {
          field_V = null;
          if (!((gf) this).field_G) {
            return;
          } else {
            ((gf) this).field_G = false;
            return;
          }
        }
    }

    private final ag a(byte param0, String param1, wc param2) {
        ag var4 = null;
        int var5 = 0;
        var4 = new ag(param1, param2);
        var4.field_r = (pf) (Object) new mm();
        if (param0 != 103) {
          ((gf) this).field_lb = null;
          var5 = -6 + ((gf) this).field_k;
          ((gf) this).field_k = ((gf) this).field_k + 38;
          var4.a(30, var5, -16 + (-14 + ((gf) this).field_v), 15, -77);
          ((gf) this).c(-105, (qm) (Object) var4);
          ((gf) this).e((byte) 116);
          return var4;
        } else {
          var5 = -6 + ((gf) this).field_k;
          ((gf) this).field_k = ((gf) this).field_k + 38;
          var4.a(30, var5, -16 + (-14 + ((gf) this).field_v), 15, -77);
          ((gf) this).c(-105, (qm) (Object) var4);
          ((gf) this).e((byte) 116);
          return var4;
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        Object var7 = null;
        if (((gf) this).field_lb == param4) {
          vn.a((byte) 4);
          this.g(48);
          if (param0) {
            return;
          } else {
            var7 = null;
            gf.a((byte) -109, (eg) null);
            return;
          }
        } else {
          if (((gf) this).field_kb != param4) {
            if (!param0) {
              var7 = null;
              gf.a((byte) -109, (eg) null);
              return;
            } else {
              return;
            }
          } else {
            this.g(57);
            if (param0) {
              return;
            } else {
              var7 = null;
              gf.a((byte) -109, (eg) null);
              return;
            }
          }
        }
    }

    public static void k(byte param0) {
        field_V = null;
        field_jb = null;
        int var1 = -52 / ((param0 - 47) / 39);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "This option cannot be combined with the current '<%0>' setting.";
        field_V = "Please enter your age in years";
    }
}
