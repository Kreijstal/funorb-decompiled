/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends df implements vb {
    static k field_E;
    private ag field_H;
    private ag field_C;
    static aj field_G;
    static String field_D;
    private ag field_F;

    final static void a(boolean param0, int param1, int param2) {
        vd.field_l = param2;
        to.field_p = param1;
        if (!param0) {
            field_E = null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param0 >= -52) {
          return;
        } else {
          var5 = param1 + ((td) this).field_n;
          var6 = ((td) this).field_j - -param3;
          int discarded$1 = ia.field_c.a(qe.field_j, 20 + var5, var6 - -20, ((td) this).field_v - 40, -50 + ((td) this).field_k, 16777215, -1, 1, 0, ia.field_c.field_C);
          this.a((byte) -60, param1, param2, param3);
          return;
        }
    }

    public td() {
        super(0, 0, 476, 225, (pf) null);
        ((td) this).field_C = new ag(ib.field_t, (wc) null);
        ((td) this).field_F = new ag(kn.field_rb, (wc) null);
        ((td) this).field_H = new ag(rc.field_n, (wc) null);
        mm var1 = new mm();
        ((td) this).field_C.field_r = (pf) (Object) var1;
        ((td) this).field_F.field_r = (pf) (Object) var1;
        ((td) this).field_H.field_r = (pf) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1746420001;
        ((td) this).field_F.a(30, -var2 + (((td) this).field_k - 48), var4, -var3 + ((td) this).field_v >> 409623201, -50);
        ((td) this).field_H.a(30, -var2 + (((td) this).field_k - 48), var4, var4 + (-var3 + ((td) this).field_v >> -1356454271) + var2, -73);
        ((td) this).field_C.a(30, ((td) this).field_k - 78 + -(var2 * 2), var3, -var3 + ((td) this).field_v >> -951166143, -103);
        ((td) this).field_F.field_o = (wc) this;
        ((td) this).field_C.field_o = (wc) this;
        ((td) this).field_C.field_q = dh.field_Bb;
        ((td) this).field_H.field_o = (wc) this;
        ((td) this).field_H.field_q = hj.field_c;
        ((td) this).c(-102, (qm) (Object) ((td) this).field_F);
        ((td) this).c(-109, (qm) (Object) ((td) this).field_C);
        ((td) this).c(-76, (qm) (Object) ((td) this).field_H);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0) {
          if (param4 != ((td) this).field_F) {
            if (param4 != ((td) this).field_C) {
              if (((td) this).field_H == param4) {
                oo.g(4);
                return;
              } else {
                return;
              }
            } else {
              wk.k(970210916);
              return;
            }
          } else {
            bl.d((byte) 109);
            return;
          }
        } else {
          field_G = null;
          if (param4 != ((td) this).field_F) {
            if (param4 != ((td) this).field_C) {
              if (((td) this).field_H != param4) {
                return;
              } else {
                oo.g(4);
                return;
              }
            } else {
              wk.k(970210916);
              return;
            }
          } else {
            bl.d((byte) 109);
            return;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 <= -76) {
          if (null != ch.field_c) {
            if (ob.field_eb != qc.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          td.a((byte) 111);
          if (null != ch.field_c) {
            if (ob.field_eb != qc.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        int var3 = 0;
        byte[] var4 = null;
        bg var5 = null;
        if (param0 != null) {
          var3 = -76 / ((-73 - param1) / 52);
          if (param0 instanceof byte[]) {
            var4 = (byte[]) param0;
            if (!param2) {
              return var4;
            } else {
              return dd.a(var4, 0);
            }
          } else {
            if (param0 instanceof bg) {
              var5 = (bg) param0;
              return var5.b((byte) -43);
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 != 115) {
            return;
        }
        field_D = null;
        field_G = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        if (param1 < -120) {
          if (this.a(param0, (byte) -127, param2, param3)) {
            return true;
          } else {
            if (-99 == param3) {
              return ((td) this).a(param0, 9555);
            } else {
              if (-100 != param3) {
                return false;
              } else {
                return ((td) this).b(2, param0);
              }
            }
          }
        } else {
          return true;
        }
    }

    final static boolean e(boolean param0) {
        if (!param0) {
            return true;
        }
        return qf.field_d >= 2 ? true : false;
    }

    final static void a(int param0, byte param1, int param2, ll param3, int param4, int param5) {
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
        L0: {
          var21 = ArcanistsMulti.field_G ? 1 : 0;
          var6 = (-param0 + param2 << 1038936520) / param3.field_g;
          var7 = param3.field_j * var6 + (param0 << -1363161080);
          param5 = param5 + param3.field_f;
          param4 = param4 + param3.field_j;
          var8 = param4 + param5 * de.field_e;
          var9 = 0;
          var10 = param3.field_c;
          var11 = param3.field_h;
          var12 = de.field_e - var11;
          var13 = 0;
          if (de.field_c > param5) {
            var14 = de.field_c + -param5;
            var8 = var8 + de.field_e * var14;
            var9 = var9 + var11 * var14;
            param5 = de.field_c;
            var10 = var10 - var14;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 < de.field_i) {
            var14 = de.field_i - param4;
            var12 = var12 + var14;
            var8 = var8 + var14;
            param4 = de.field_i;
            var13 = var13 + var14;
            var9 = var9 + var14;
            var7 = var7 + var6 * var14;
            var11 = var11 - var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var10 + param5 <= de.field_k) {
            break L2;
          } else {
            var10 = var10 - (param5 + (var10 + -de.field_k));
            break L2;
          }
        }
        L3: {
          var14 = 127 % ((-32 - param1) / 32);
          if (var11 + param4 <= de.field_h) {
            break L3;
          } else {
            var15 = param4 - (-var11 + de.field_h);
            var13 = var13 + var15;
            var11 = var11 - var15;
            var12 = var12 + var15;
            break L3;
          }
        }
        if (-1 > (var11 ^ -1)) {
          if (var10 >= -1) {
            return;
          } else {
            param5 = -var10;
            L4: while (true) {
              if (0 <= param5) {
                return;
              } else {
                var15 = var7;
                param4 = -var11;
                L5: while (true) {
                  if (-1 >= (param4 ^ -1)) {
                    var9 = var9 + var13;
                    var8 = var8 + var12;
                    param5++;
                    continue L4;
                  } else {
                    var16 = var15 >> -517440856;
                    var15 = var15 + var6;
                    var17 = -var16 + 256;
                    if (0 > var16) {
                      var9++;
                      var8++;
                      param4++;
                      continue L5;
                    } else {
                      var9++;
                      var18 = param3.field_l[255 & param3.field_m[var9]];
                      if (-1 != var18) {
                        if (-256 >= var16) {
                          var19 = de.field_l[var8];
                          var20 = (16711935 & var18) * var16 + var17 * (var19 & 16711935) >> 2073140680 & 16711935;
                          de.field_l[var8] = var20 + dg.a(65280, dg.a(65280, var18) * var16 + dg.a(var19, 65280) * var17 >> -1493158680);
                          var8++;
                          param4++;
                          continue L5;
                        } else {
                          de.field_l[var8] = var18;
                          var8++;
                          param4++;
                          continue L5;
                        }
                      } else {
                        var8++;
                        param4++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Now you will be given every Arcanist's staple spell: Arcane Arrow. This spell is an important addition to any spellbook, providing you with a way of making accurate attacks upon weakened targets.";
        field_G = new aj(4, 1, 1, 1);
    }
}
