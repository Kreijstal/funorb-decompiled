/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends al {
    private int field_m;
    private boolean field_n;
    static cg field_p;
    static String[] field_o;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          var2 = vh.field_b;
          if (param0 < -35) {
            break L0;
          } else {
            ((kl) this).a((byte) -96);
            break L0;
          }
        }
        var3 = id.field_M;
        bi.d();
        if (((kl) this).field_n) {
          this.d(-105);
          return;
        } else {
          L1: {
            bi.c(-32 + vh.field_b, 0, 672 + vh.field_b, nh.field_P);
            if (260 <= ((kl) this).field_m) {
              if (((kl) this).field_m >= 388) {
                if (-509 < (((kl) this).field_m ^ -1)) {
                  nn.field_j.e(var2, var3);
                  we.field_Ub.b(var2, 480 + (var3 - we.field_Ub.field_q));
                  break L1;
                } else {
                  if (((kl) this).field_m >= 1564) {
                    if (((kl) this).field_m < 1724) {
                      nn.field_j.e(-264 + var2, var3);
                      pg.field_t.b(var2 - -270, 200 + var3);
                      break L1;
                    } else {
                      if (((kl) this).field_m >= 1852) {
                        if (((kl) this).field_m >= 2152) {
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        nn.field_j.b(-264 + var2, var3);
                        pg.field_t.b(var2 + 270, 200 + var3);
                        bi.a(0, var3, bd.field_e, 550, 0, 2 * ((kl) this).field_m + -3448);
                        break L1;
                      }
                    }
                  } else {
                    var4 = -508 + ((kl) this).field_m;
                    nn.field_j.e(-(var4 >> -1918632702) + var2, var3);
                    var5 = var4 * 3 >> 1162789026;
                    we.field_Ub.b(-var5 + var2, var3 + 480 + -we.field_Ub.field_q);
                    pg.field_t.b(1062 + (var2 + -var5), 200 + var3);
                    break L1;
                  }
                }
              } else {
                nn.field_j.b(var2, var3);
                we.field_Ub.b(var2, -we.field_Ub.field_q + (480 + var3));
                bi.a(0, var3, bd.field_e, 550, 0, -(2 * (-260 + ((kl) this).field_m)) + 256);
                break L1;
              }
            } else {
              break L1;
            }
          }
          L2: {
            this.d(-119);
            bi.c(-32 + vh.field_b, 0, vh.field_b + 672, nh.field_P);
            if ((((kl) this).field_m ^ -1) >= -121) {
              break L2;
            } else {
              if ((((kl) this).field_m ^ -1) <= -389) {
                break L2;
              } else {
                bj.field_q.a(rg.field_L, bd.field_d, Math.min(510 + id.field_M, nh.field_P - 20), 16777215, 0);
                break L2;
              }
            }
          }
          L3: {
            if (640 >= bd.field_e) {
              break L3;
            } else {
              var4 = 8;
              bi.g(-1 + vh.field_b, id.field_M, 550, 0, 4);
              var5 = vh.field_b + -2;
              L4: while (true) {
                L5: {
                  if (0 >= var5) {
                    break L5;
                  } else {
                    if (256 <= var4) {
                      break L5;
                    } else {
                      bi.g(var5, id.field_M, 550, 0, var4);
                      var4 += 8;
                      var5--;
                      continue L4;
                    }
                  }
                }
                var4 = 8;
                bi.g(640 + vh.field_b, id.field_M, 550, 0, 4);
                var5 = 640 + vh.field_b + 1;
                L6: while (true) {
                  if (var5 >= bd.field_e) {
                    break L3;
                  } else {
                    if (256 <= var4) {
                      break L3;
                    } else {
                      bi.g(var5, id.field_M, 550, 0, var4);
                      var4 += 8;
                      var5++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var10 = ZombieDawn.field_J;
        var3 = 26 / ((-41 - param0) / 63);
        var2 = vh.field_b;
        var4 = id.field_M;
        var5 = null;
        var6 = 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= jc.field_q.length) {
            L1: {
              var7 = 50 + var4;
              if (var5_ref != null) {
                L2: {
                  var8 = -5 + (sg.field_jb.field_I + sg.field_jb.field_x);
                  if (var5_ref != gj.field_o[6]) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var9 = stackIn_17_0;
                    if (var9 != 0) {
                      break L4;
                    } else {
                      if (var5_ref != gj.field_o[5]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7 = 180 + var4;
                  break L3;
                }
                L5: {
                  if (var9 != 0) {
                    int discarded$3 = sg.field_jb.a(gj.field_o[5], 60 + var2, var7, 520, 200, 0, 0, 1, 0, var8);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (null == eg.field_n) {
                      break L7;
                    } else {
                      if (eg.field_n != var5_ref) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.a(var8, var7 + -var4, 5, var5_ref);
                  break L6;
                }
                if (256 > var6) {
                  int discarded$4 = sg.field_jb.a(var5_ref, var2 + 60, var7, 520, 200, 0, 0, var6, 1, 0, var8);
                  so.b(lf.field_h, var2, var4, var6);
                  break L1;
                } else {
                  int discarded$5 = sg.field_jb.a(var5_ref, var2 + 60, var7, 520, 200, 0, 0, 1, 0, var8);
                  if (var9 != 0) {
                    break L1;
                  } else {
                    so.a(lf.field_h, var2, var4);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            eg.field_n = var5_ref;
            return;
          } else {
            var9 = -jc.field_q[var8] + ((kl) this).field_m;
            if (0 < var9) {
              if (var9 < 50 + a.field_g[var8] + 10) {
                L8: {
                  var6 = 256;
                  if (var9 < 10) {
                    var6 = (var9 << -836471032) / 10;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var5_ref = gj.field_o[var8];
                if (var9 > 10 + a.field_g[var8]) {
                  var6 = -((-a.field_g[var8] + -10 + var9 << 1982415592) / 50) + 256;
                  var8++;
                  continue L0;
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var8++;
                continue L0;
              }
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final static void c(int param0) {
        if (null != sh.field_d) {
            sh.field_d.a();
        }
        if (!(cf.field_fb == null)) {
            cf.field_fb.a();
        }
        if (param0 != -16861) {
            kl.e(-83, 78);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 != 65793) {
            kl.c(95);
        }
        if ((((kl) this).field_m ^ -1) >= -101) {
            return true;
        }
        this.d((byte) -117);
        return true;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          ((kl) this).field_m = ((kl) this).field_m + 1;
          jc.field_q = new int[]{90, 490, 830, 1170, 1510, 1970, 2020};
          a.field_g = new int[]{280, 180, 180, 180, 180, 180, 180};
          if (1 != ci.field_d) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if ((((kl) this).field_m ^ -1) > -2153) {
            if (var3 == 0) {
              break L1;
            } else {
              if (100 >= ((kl) this).field_m) {
                break L1;
              } else {
                this.d((byte) 113);
                break L1;
              }
            }
          } else {
            if (var3 == 0) {
              break L1;
            } else {
              if (100 >= ((kl) this).field_m) {
                break L1;
              } else {
                this.d((byte) 113);
                break L1;
              }
            }
          }
        }
        L2: {
          if (((kl) this).field_m != jc.field_q[0]) {
            break L2;
          } else {
            ph.a((byte) 103, w.field_a[9]);
            break L2;
          }
        }
        L3: {
          var4 = -71 / ((param0 - -39) / 61);
          if ((((kl) this).field_m ^ -1) >= -1897) {
            break L3;
          } else {
            if (2152 <= ((kl) this).field_m) {
              break L3;
            } else {
              L4: {
                var5 = -((kl) this).field_m + 2152;
                if ((var5 ^ -1) > -1) {
                  var5 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              ZombieDawn.b(119, vk.field_a * var5 >> -1860126584);
              break L3;
            }
          }
        }
    }

    final void a(al param0, int param1) {
        ((kl) this).field_n = true;
        if (param1 <= 70) {
            this.d(-27);
        }
        oj.field_d.c(100, 10);
    }

    final static boolean a(String param0, int param1, fk param2, String param3, int param4, String param5, boolean param6) {
        if (ic.field_S != fk.field_F) {
            return false;
        }
        if (param1 != 640) {
            kl.e(-27, 118);
        }
        md var8 = new md(e.field_S, param2);
        e.field_S.a((ga) (Object) var8, true);
        if (sn.b((byte) 12)) {
            var8.c(false);
        } else {
            to.field_d = param5;
            ae.field_a = param4;
            da.field_i = param0;
            df.field_l = param6 ? true : false;
            mp.field_f = null;
            we.field_Rb = param3;
            fk.field_F = vh.field_c;
            return true;
        }
        return true;
    }

    kl(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ((kl) this).field_m = 0;
        ((kl) this).field_n = false;
    }

    private final void d(byte param0) {
        int var2 = 118 % ((61 - param0) / 52);
        ZombieDawn.b(117, vk.field_a);
        ph.a((byte) 47, w.field_a[1]);
        ca.a(true, true, 0);
    }

    private final void a(int param0, int param1, int param2, String param3) {
        lf.field_h.a();
        bi.d();
        int discarded$0 = sg.field_jb.a(param3, 60, param1, 520, 200, 4, 0, 1, 0, param0);
        so.a(16777215);
        so.a(16777215);
        so.a(16777215);
        so.a(16777215);
        bi.h(5, 5, 0, 0, 640, 480);
        int discarded$1 = sg.field_jb.a(param3, 60, param1, 520, 200, param2, 0, 1, 0, param0);
        cn.field_f.b(param2 + 11);
    }

    final static void e(int param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        if (be.field_j <= 0) {
            if (!(-1 <= (param0 ^ -1))) {
                return;
            }
        }
        bn.field_i = param0;
        ki.a((byte) -119, cc.field_b);
        bi.d();
        vn var2 = f.field_d;
        int var3 = 0;
        int var4 = 0;
        var2.b(var3 + 10, var4 + 10);
        for (var5 = 0; -4 < (var5 ^ -1); var5++) {
            so.a(16777045);
        }
        var2.d(10 - -var3, 10 - -var4, 0);
        if (param1 != 16777045) {
            return;
        }
        bi.h(2, 2, 0, 0, 195, 170);
        pa.a(-21189);
        ti.field_b = 3 * wd.field_z.length >> 1906120194;
    }

    public static void e(byte param0) {
        if (param0 != -112) {
            field_p = null;
        }
        field_o = null;
        field_p = null;
    }

    final void e(int param0) {
        ((kl) this).field_n = false;
        if (param0 >= -123) {
            return;
        }
        boolean discarded$0 = oj.field_d.a(false, 10);
        ((kl) this).field_m = 0;
        ch.b(65);
        vk.field_a = ce.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new cg(0, 2, 2, 1);
        field_o = new String[]{"4 new stages full of zombifying action", "Fight new enemies trying to chase you out of their land", "Trick humans into opening your path and use new powerups", "Take over the Palace and seize the throne!"};
    }
}
