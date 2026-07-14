/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    int field_f;
    static int field_n;
    db field_p;
    db field_k;
    int field_a;
    static String field_s;
    db field_o;
    private boolean field_m;
    int field_l;
    wl field_d;
    int field_h;
    int field_q;
    private int field_c;
    db field_b;
    db field_i;
    static ed field_e;
    int field_j;
    int field_r;
    static hh field_g;

    final static void a(mf param0, mf param1, byte param2) {
        ck.field_x = param0;
        pc.field_e = param1;
        if (param2 != -96) {
            String discarded$0 = uf.a(-27);
        }
    }

    final static boolean c(int param0) {
        if (param0 < 2) {
            return false;
        }
        return dg.field_o == ui.field_b ? true : false;
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
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
        L0: {
          var15 = EscapeVector.field_A;
          var5 = ((uf) this).field_j + ((uf) this).field_f;
          var6 = ((uf) this).field_l - -((uf) this).field_r;
          var7 = ((uf) this).field_q;
          if (0 != (var7 ^ -1)) {
            break L0;
          } else {
            var7 = ((uf) this).field_d.field_x + ((uf) this).field_d.field_r;
            break L0;
          }
        }
        var8 = em.field_l >> 1175915906;
        var9 = ((uf) this).field_d.b(param3);
        var10 = ((uf) this).field_d.field_x + ((uf) this).field_d.field_r;
        var11 = 1;
        if (var8 < var9) {
          L1: {
            if (var8 >= var9) {
              var12 = var8;
              break L1;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
              break L1;
            }
          }
          L2: {
            if (null == co.field_c) {
              co.field_c = new String[16];
              break L2;
            } else {
              break L2;
            }
          }
          var11 = ((uf) this).field_d.a(param3, new int[1], co.field_c);
          var9 = 0;
          var10 = var10 + (-1 + var11) * var7;
          var13 = 0;
          L3: while (true) {
            if (var11 > var13) {
              var14 = ((uf) this).field_d.b(co.field_c[var13]);
              if (var9 < var14) {
                var9 = var14;
                var13++;
                continue L3;
              } else {
                var13++;
                continue L3;
              }
            } else {
              L4: {
                var12 = param0;
                if (var9 + var12 - -var5 > em.field_l) {
                  var12 = em.field_l + -var9 - var5;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var13 = 32 + (-((uf) this).field_d.field_N + param2);
                if (var6 + (var13 - -var10) <= em.field_d) {
                  break L5;
                } else {
                  var13 = -var10 + (param2 + -var6);
                  break L5;
                }
              }
              em.b(var12, var13, var9 - -var5, var6 + var10, ((uf) this).field_h);
              em.a(1 + var12, var13 + 1, -2 + (var9 + var5), -2 + var6 + var10, ((uf) this).field_a);
              if (param1 <= 2) {
                return;
              } else {
                int discarded$3 = ((uf) this).field_d.a(param3, var12 - -((uf) this).field_f, ((uf) this).field_l + var13, var9, var10, ((uf) this).field_c, -1, 0, 0, var7);
                return;
              }
            }
          }
        } else {
          if ((param3.indexOf("<br>") ^ -1) != 0) {
            L6: {
              if (var8 >= var9) {
                var12 = var8;
                break L6;
              } else {
                var13 = var9 / var8;
                var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
                break L6;
              }
            }
            L7: {
              if (null == co.field_c) {
                co.field_c = new String[16];
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var11 = ((uf) this).field_d.a(param3, new int[1], co.field_c);
              var9 = 0;
              var10 = var10 + (-1 + var11) * var7;
              var13 = 0;
              if (var11 <= var13) {
                break L8;
              } else {
                L9: {
                  var14 = ((uf) this).field_d.b(co.field_c[var13]);
                  if (var9 < var14) {
                    var9 = var14;
                    break L9;
                  } else {
                    var13++;
                    break L9;
                  }
                }
                var13++;
                var13++;
                var13++;
                break L8;
              }
            }
            L10: {
              var12 = param0;
              if (var9 + var12 - -var5 > em.field_l) {
                var12 = em.field_l + -var9 - var5;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var13 = 32 + (-((uf) this).field_d.field_N + param2);
              if (var6 + (var13 - -var10) <= em.field_d) {
                break L11;
              } else {
                var13 = -var10 + (param2 + -var6);
                break L11;
              }
            }
            em.b(var12, var13, var9 - -var5, var6 + var10, ((uf) this).field_h);
            em.a(1 + var12, var13 + 1, -2 + (var9 + var5), -2 + var6 + var10, ((uf) this).field_a);
            if (param1 <= 2) {
              return;
            } else {
              int discarded$4 = ((uf) this).field_d.a(param3, var12 - -((uf) this).field_f, ((uf) this).field_l + var13, var9, var10, ((uf) this).field_c, -1, 0, 0, var7);
              return;
            }
          } else {
            L12: {
              var12 = param0;
              if (var9 + var12 - -var5 > em.field_l) {
                var12 = em.field_l + -var9 - var5;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var13 = 32 + (-((uf) this).field_d.field_N + param2);
              if (var6 + (var13 - -var10) <= em.field_d) {
                break L13;
              } else {
                var13 = -var10 + (param2 + -var6);
                break L13;
              }
            }
            em.b(var12, var13, var9 - -var5, var6 + var10, ((uf) this).field_h);
            em.a(1 + var12, var13 + 1, -2 + (var9 + var5), -2 + var6 + var10, ((uf) this).field_a);
            if (param1 <= 2) {
              return;
            } else {
              int discarded$5 = ((uf) this).field_d.a(param3, var12 - -((uf) this).field_f, ((uf) this).field_l + var13, var9, var10, ((uf) this).field_c, -1, 0, 0, var7);
              return;
            }
          }
        }
    }

    final static String a(int param0) {
        Object var2 = null;
        if (dn.field_q != dg.field_o) {
          if (param0 != 30519) {
            var2 = null;
            uf.a((mf) null, (mf) null, (byte) 91);
            return bm.field_g;
          } else {
            return bm.field_g;
          }
        } else {
          return mf.field_b;
        }
    }

    final static void a(byte param0, String param1, boolean param2) {
        if (param0 <= 42) {
          return;
        } else {
          ha.field_a = param2;
          ei.field_i = true;
          be.field_b = new pn(bo.field_F, dl.field_b, param1, eb.field_H, ha.field_a);
          bo.field_F.b((hm) (Object) be.field_b, 77);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 != -29666) {
          String discarded$2 = uf.a(15);
          em.d(param3, param4, param0, param1, param5);
          return;
        } else {
          em.d(param3, param4, param0, param1, param5);
          return;
        }
    }

    final void a(int param0, wl param1) {
        ed[] var22 = null;
        ed[] var5 = null;
        uh var21 = null;
        uh var20 = null;
        int var7 = 0;
        he var6 = null;
        he var23 = null;
        he var24 = null;
        ed[] var26 = null;
        ed[] var9 = null;
        ed[] var25 = null;
        ed[] var10 = null;
        he var27 = null;
        he var28 = null;
        ed var29 = null;
        he var14 = null;
        he var30 = null;
        int var15 = EscapeVector.field_A;
        k var17 = new k(param1, 2, 2, 2236962, 1, 1, 1, param1.field_x + param1.field_r + 2);
        ((uf) this).field_i = (db) (Object) var17;
        var17.field_h = 16777215;
        he var4 = new he();
        if (param0 != -31476) {
            field_n = 115;
            var17.a((k) (Object) var4, 77);
            ((uf) this).field_c = 15658734;
            ((uf) this).field_r = 3;
            ((uf) this).field_a = 5592405;
            ((uf) this).field_j = 3;
            ((uf) this).field_l = 3;
            ((uf) this).field_h = 15658734;
            ((uf) this).field_q = -1;
            ((uf) this).field_f = 3;
            var4.field_i = 11711154;
            var4.field_g = 15658734;
            ((uf) this).field_d = param1;
            ef discarded$0 = var4.a(0, (byte) -53).a(15658734, -22572).a(2, ph.a(8947848, 1, 10066329, 7829367));
            ef discarded$1 = var4.a(1, (byte) -53).a(2, ph.a(11184810, 1, 10066329, 13421772));
            ef discarded$2 = var4.a(3, (byte) -53).a(2, ph.a(8947848, 1, 7829367, 10066329)).c(101, 1).a(1, (byte) 102);
            var22 = new ed[9];
            var5 = var22;
            var21 = new uh(32, 32);
            var20 = var21;
            for (var7 = 0; var20.field_B.length > var7; var7++) {
                var21.field_B[var7] = 1077952576;
            }
            var5[4] = (ed) (Object) var20;
            ef discarded$3 = var4.a(4, (byte) -53).a(param0 ^ 31367, true).a(2, var22);
            ef discarded$4 = var4.a(5, (byte) -53).a(2, vd.a(65793, 0, 0, 0, 1317)).a(param0 + 31367, true).a(-1, -22572);
            ((uf) this).field_o = (db) (Object) var4;
            var6 = new he(var4, true);
            var6.field_m = 0;
            var23 = new he(var4, true);
            var23.field_m = 0;
            var23.a(jj.a(8947848, 46), param0 + 31482);
            ef discarded$5 = var23.a(1, (byte) -53).a(2, jj.a(11184810, 51)).a(2236962, -22572);
            ((uf) this).field_k = (db) (Object) new hn(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
            sc discarded$6 = new sc(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            ve discarded$7 = new ve(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var24 = new he();
            var17.a((k) (Object) var24, 111);
            ef discarded$8 = var24.a(0, (byte) -53).a(2, ph.a(15658734, 1, 7829367, 10066329)).a(1118481, -22572).b(-93, -1);
            ef discarded$9 = var24.a(4, (byte) -53).a(-121, true).a(param0 + 31478, var22);
            ((uf) this).field_p = (db) (Object) var24;
            var26 = new ed[9];
            var9 = var26;
            var25 = new ed[9];
            var10 = var25;
            var9[4] = new ed(2, 1);
            var10[4] = new ed(1, 2);
            var26[4].field_B = new int[]{6710886, 7829367};
            var25[4].field_B = new int[]{6710886, 7829367};
            var27 = new he();
            var28 = new he();
            var27.a(var26, 0, (byte) -117);
            var28.a(var25, 0, (byte) -117);
            var29 = new ed(7, 4);
            var29.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new he(var4, true);
            var14.a(var29.b(), (byte) 74);
            var29.a();
            var14 = new he(var4, true);
            var14.a(var29.b(), (byte) 118);
            var29.a();
            var14 = new he(var4, true);
            var14.a(var29.b(), (byte) 78);
            var29.a();
            var30 = new he(var4, true);
            var30.a(var29, (byte) 87);
            return;
        }
        var17.a((k) (Object) var4, 77);
        ((uf) this).field_c = 15658734;
        ((uf) this).field_r = 3;
        ((uf) this).field_a = 5592405;
        ((uf) this).field_j = 3;
        ((uf) this).field_l = 3;
        ((uf) this).field_h = 15658734;
        ((uf) this).field_q = -1;
        ((uf) this).field_f = 3;
        var4.field_i = 11711154;
        var4.field_g = 15658734;
        ((uf) this).field_d = param1;
        ef discarded$10 = var4.a(0, (byte) -53).a(15658734, -22572).a(2, ph.a(8947848, 1, 10066329, 7829367));
        ef discarded$11 = var4.a(1, (byte) -53).a(2, ph.a(11184810, 1, 10066329, 13421772));
        ef discarded$12 = var4.a(3, (byte) -53).a(2, ph.a(8947848, 1, 7829367, 10066329)).c(101, 1).a(1, (byte) 102);
        ed[] var33 = new ed[9];
        var5 = var33;
        uh var32 = new uh(32, 32);
        uh var31 = var32;
        for (var7 = 0; var31.field_B.length > var7; var7++) {
            var32.field_B[var7] = 1077952576;
        }
        var5[4] = (ed) (Object) var31;
        ef discarded$13 = var4.a(4, (byte) -53).a(param0 ^ 31367, true).a(2, var33);
        ef discarded$14 = var4.a(5, (byte) -53).a(2, vd.a(65793, 0, 0, 0, 1317)).a(param0 + 31367, true).a(-1, -22572);
        ((uf) this).field_o = (db) (Object) var4;
        var6 = new he(var4, true);
        var6.field_m = 0;
        he var34 = new he(var4, true);
        var34.field_m = 0;
        var34.a(jj.a(8947848, 46), param0 + 31482);
        ef discarded$15 = var34.a(1, (byte) -53).a(2, jj.a(11184810, 51)).a(2236962, -22572);
        ((uf) this).field_k = (db) (Object) new hn(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        sc discarded$16 = new sc(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        ve discarded$17 = new ve(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        he var35 = new he();
        var17.a((k) (Object) var35, 111);
        ef discarded$18 = var35.a(0, (byte) -53).a(2, ph.a(15658734, 1, 7829367, 10066329)).a(1118481, -22572).b(-93, -1);
        ef discarded$19 = var35.a(4, (byte) -53).a(-121, true).a(param0 + 31478, var33);
        ((uf) this).field_p = (db) (Object) var35;
        ed[] var37 = new ed[9];
        var9 = var37;
        ed[] var36 = new ed[9];
        var10 = var36;
        var9[4] = new ed(2, 1);
        var10[4] = new ed(1, 2);
        var37[4].field_B = new int[]{6710886, 7829367};
        var36[4].field_B = new int[]{6710886, 7829367};
        he var38 = new he();
        he var39 = new he();
        var38.a(var37, 0, (byte) -117);
        var39.a(var36, 0, (byte) -117);
        ed var40 = new ed(7, 4);
        var40.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        var14 = new he(var4, true);
        var14.a(var40.b(), (byte) 74);
        var40.a();
        var14 = new he(var4, true);
        var14.a(var40.b(), (byte) 118);
        var40.a();
        var14 = new he(var4, true);
        var14.a(var40.b(), (byte) 78);
        var40.a();
        he var41 = new he(var4, true);
        var41.a(var40, (byte) 87);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 1) {
            return;
        }
        em.a(param6, param3, param4, param0, param5, param2);
    }

    final void a(byte param0, String param1, int param2, int param3) {
        if (!((uf) this).field_m) {
          this.a(param1, param3, param2, 16777215);
          if (param0 < -29) {
            return;
          } else {
            ((uf) this).a(-88, -91, 122, 46, 47, -59, -12);
            return;
          }
        } else {
          this.a(param2, 29, param3, param1);
          if (param0 < -29) {
            return;
          } else {
            ((uf) this).a(-88, -91, 122, 46, 47, -59, -12);
            return;
          }
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = ((uf) this).field_d.b(param0);
          var6 = ((uf) this).field_d.field_x + ((uf) this).field_d.field_N;
          var7 = param2;
          if (em.field_l >= 6 + var7 + var5) {
            break L0;
          } else {
            var7 = -6 + -var5 + em.field_l;
            break L0;
          }
        }
        if (param3 != 16777215) {
          return;
        } else {
          L1: {
            var8 = param1 + (-((uf) this).field_d.field_N + 32);
            if (em.field_d < var6 + (var8 - -6)) {
              var8 = em.field_d + -var6 + -6;
              break L1;
            } else {
              break L1;
            }
          }
          em.b(var7, var8, var5 + 6, var6 - -6, ((uf) this).field_c);
          em.a(1 + var7, 1 + var8, 4 + var5, 4 + var6, ((uf) this).field_a);
          ((uf) this).field_d.a(param0, 3 + var7, var8 - -3 - -((uf) this).field_d.field_N, ((uf) this).field_c, -1);
          return;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 != -27204) {
          var2 = null;
          uf.a((mf) null, (mf) null, (byte) 55);
          field_g = null;
          field_e = null;
          field_s = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_s = null;
          return;
        }
    }

    public uf() {
        ((uf) this).field_m = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Quit";
    }
}
