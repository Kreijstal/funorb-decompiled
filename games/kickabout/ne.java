/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ne extends dj {
    static String field_J;
    static boolean[] field_G;
    static String field_H;
    static String field_L;
    static tf field_I;
    private tk field_E;
    private up[] field_F;
    private kq[] field_K;

    final static hd j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ej var10 = null;
        int var11 = 0;
        hd var12 = null;
        ej stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        ej stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        ej stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        ej stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        ej stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        ej stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        L0: {
          var11 = Kickabout.field_G;
          var12 = new hd();
          if (param0 == 15) {
            break L0;
          } else {
            hd discarded$1 = ne.j((byte) 80);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = 0;
            var3 = ca.field_f.length;
            if (!vl.b(param0 + -15)) {
              break L2;
            } else {
              if (wn.a((byte) 50)) {
                break L1;
              } else {
                if (c.a(bo.field_Ab[32], 0, bh.field_f)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          var3--;
          break L1;
        }
        var4 = 0;
        L3: while (true) {
          if (var4 >= var3) {
            var12.a(true, 300, 0, 0, 48 * (var3 - 1) + 40);
            return var12;
          } else {
            var5 = new hd();
            var5.a(true, fn.field_d.field_q, 20, 44 + var4 * 44 - 10, fn.field_d.field_w);
            var5.field_N = (ut) (Object) fn.field_d;
            var12.a((byte) -121, var5);
            var6 = ca.field_f[var4];
            var7 = 0;
            L4: while (true) {
              if (var7 >= ca.field_f[var4]) {
                var7 = 0;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= ca.field_f[var4]) {
                    var4++;
                    continue L3;
                  } else {
                    L6: {
                      var9 = 0;
                      if (!hv.field_a[bo.field_Ab[var2]]) {
                        break L6;
                      } else {
                        if (!c.a(bo.field_Ab[var2], 0, bh.field_f)) {
                          var9 = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var9 == 0) {
                      L7: {
                        var10 = new ej(bo.field_Ab[var2]);
                        stackOut_24_0 = (ej) var10;
                        stackOut_24_1 = 1;
                        stackOut_24_2 = 32;
                        stackOut_24_3 = -((var6 >> 559267457) * 50) + 120;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        if (-1 == (var6 % 2 ^ -1)) {
                          stackOut_26_0 = (ej) (Object) stackIn_26_0;
                          stackOut_26_1 = stackIn_26_1;
                          stackOut_26_2 = stackIn_26_2;
                          stackOut_26_3 = stackIn_26_3;
                          stackOut_26_4 = 25;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          stackIn_27_3 = stackOut_26_3;
                          stackIn_27_4 = stackOut_26_4;
                          break L7;
                        } else {
                          stackOut_25_0 = (ej) (Object) stackIn_25_0;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = stackIn_25_2;
                          stackOut_25_3 = stackIn_25_3;
                          stackOut_25_4 = 0;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          stackIn_27_3 = stackOut_25_3;
                          stackIn_27_4 = stackOut_25_4;
                          break L7;
                        }
                      }
                      ((ej) (Object) stackIn_27_0).a(stackIn_27_1 != 0, stackIn_27_2, stackIn_27_3 + (stackIn_27_4 - -(var7 * 50)), 10 + 44 * var4, 32);
                      var2++;
                      var7++;
                      var12.a((byte) -121, (hd) (Object) var10);
                      var8++;
                      continue L5;
                    } else {
                      var2++;
                      var8++;
                      continue L5;
                    }
                  }
                }
              } else {
                if (hv.field_a[bo.field_Ab[var2 - -var7]]) {
                  if (!c.a(bo.field_Ab[var7 + var2], 0, bh.field_f)) {
                    var6--;
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                } else {
                  var7++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final void a(byte param0, boolean param1) {
        gm var3_ref_gm = null;
        int var3 = 0;
        int var4 = 0;
        gm var5_ref_gm = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gm var10 = null;
        L0: {
          var9 = Kickabout.field_G;
          super.a((byte) -106, param1);
          if (-1 == (((ne) this).field_C ^ -1)) {
            L1: {
              bk.field_a[1].field_G = 0;
              var10 = bk.field_a[0];
              var5_ref_gm = var10;
              var5_ref_gm = var10;
              var3_ref_gm = var10;
              var10.field_G = 0;
              if (field_G[rb.field_Kb]) {
                bk.field_a[0].field_G = bk.field_a[0].field_G | 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (field_G[uv.field_e]) {
                bk.field_a[0].field_G = bk.field_a[0].field_G | 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!field_G[oc.field_e]) {
                break L3;
              } else {
                bk.field_a[0].field_G = bk.field_a[0].field_G | 1;
                break L3;
              }
            }
            L4: {
              if (!field_G[pb.field_A]) {
                break L4;
              } else {
                bk.field_a[0].field_G = bk.field_a[0].field_G | 8;
                break L4;
              }
            }
            L5: {
              if (field_G[98]) {
                bk.field_a[1].field_G = bk.field_a[1].field_G | 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (field_G[96]) {
                bk.field_a[1].field_G = bk.field_a[1].field_G | 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!field_G[99]) {
                break L7;
              } else {
                bk.field_a[1].field_G = bk.field_a[1].field_G | 1;
                break L7;
              }
            }
            L8: {
              if (field_G[97]) {
                bk.field_a[1].field_G = bk.field_a[1].field_G | 8;
                break L8;
              } else {
                break L8;
              }
            }
            var4 = 0;
            L9: while (true) {
              if ((var4 ^ -1) <= -3) {
                break L0;
              } else {
                var5_ref_gm = bk.field_a[var4];
                var5_ref_gm.a(2, (la[]) null, false, false);
                var5_ref_gm.g((byte) 126);
                if (-1 != (var5_ref_gm.field_u ^ -1)) {
                  if (0 >= var5_ref_gm.field_L) {
                    var5_ref_gm.a((byte) -31, 0);
                    var4++;
                    continue L9;
                  } else {
                    var4++;
                    continue L9;
                  }
                } else {
                  var4++;
                  continue L9;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L10: {
          n.field_d = -1;
          var3 = 2147483647;
          var4 = -13 / ((38 - param0) / 60);
          if (((ne) this).field_C == 2) {
            var5 = 0;
            L11: while (true) {
              if (ip.field_b.length <= var5) {
                var5 = 0;
                L12: while (true) {
                  if (var5 >= ip.field_b.length) {
                    break L10;
                  } else {
                    ip.field_b[var5].g((byte) 125);
                    var5++;
                    continue L12;
                  }
                }
              } else {
                var6 = -tv.field_f[var5][0] + wt.field_x;
                var7 = us.field_j - tv.field_f[var5][1];
                var8 = var7 * var7 + var6 * var6;
                if (var3 > var8) {
                  var3 = var8;
                  n.field_d = var5;
                  var5++;
                  continue L11;
                } else {
                  var5++;
                  continue L11;
                }
              }
            }
          } else {
            break L10;
          }
        }
        L13: {
          L14: {
            if ((wt.field_x ^ -1) == 0) {
              break L14;
            } else {
              if (us.field_j == -1) {
                break L14;
              } else {
                if (4900 < var3) {
                  break L14;
                } else {
                  break L13;
                }
              }
            }
          }
          n.field_d = -1;
          break L13;
        }
        L15: {
          if ((((ne) this).field_C ^ -1) != -4) {
            break L15;
          } else {
            var5 = 0;
            L16: while (true) {
              if (var5 >= 9) {
                ((ne) this).field_E.field_s = ((ne) this).field_j + 220;
                ((ne) this).field_E.b(0, param1);
                ((ne) this).field_E.a(32 * id.field_v, true, (byte) -115, 32);
                break L15;
              } else {
                ((ne) this).field_K[var5].b(0, param1);
                ((ne) this).field_K[var5].a(31, 11, (byte) 126, 16, ((ne) this).field_F[var5]);
                var5++;
                continue L16;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          super.a(param0, param1);
          if ((((ne) this).field_C ^ -1) == -1) {
            this.i((byte) 96);
            break L0;
          } else {
            if (-2 != (((ne) this).field_C ^ -1)) {
              if (2 == ((ne) this).field_C) {
                this.j(param0 + 335);
                break L0;
              } else {
                if (((ne) this).field_C == 3) {
                  this.h(param0 ^ 8489);
                  break L0;
                } else {
                  if (4 != ((ne) this).field_C) {
                    if ((((ne) this).field_C ^ -1) == -6) {
                      this.i(param0 ^ -123);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    this.k(140);
                    break L0;
                  }
                }
              }
            } else {
              this.l((byte) -128);
              break L0;
            }
          }
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var8 = Kickabout.field_G;
        if (param0 == 330) {
          var2 = 0;
          L0: while (true) {
            if (ip.field_b.length <= var2) {
              L1: {
                if (n.field_d < 0) {
                  ic.a(280, bg.field_q, false, (String) null, 240, false, true, 330 - -((ne) this).field_j);
                  break L1;
                } else {
                  ic.a(280, dr.field_c[n.field_d], false, dk.field_h[n.field_d], 240, false, true, ((ne) this).field_j + 330);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                L3: {
                  iw.a(73, sn.field_k);
                  on.b();
                  if (-4 == (var2 ^ -1)) {
                    break L3;
                  } else {
                    if (var2 != 4) {
                      stackOut_8_0 = 700;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_7_0 = 600;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
              L4: {
                var3 = stackIn_9_0;
                var4 = on.field_g >> -83237119;
                var5 = on.field_f + -15;
                ip.field_b[var2].a(var3, 128, var4, var5, (byte) -87);
                ta.e(param0 + -204);
                var6 = tv.field_f[var2][0] + ((ne) this).field_j;
                var7 = tv.field_f[var2][1];
                if (var2 == n.field_d) {
                  eo.a(sn.field_k, 65793);
                  eo.a(sn.field_k, 11184810);
                  eo.a(sn.field_k, 12303291);
                  eo.a(sn.field_k, 8947848);
                  eo.a(sn.field_k, 4473924);
                  break L4;
                } else {
                  break L4;
                }
              }
              sn.field_k.f(-(sn.field_k.field_o >> 1879395746) + var6, var7 + -(sn.field_k.field_v >> -1623467806));
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var9 = Kickabout.field_G;
          if (param0 == 126) {
            break L0;
          } else {
            this.k(81);
            break L0;
          }
        }
        var2 = 0;
        var3 = 0;
        L1: while (true) {
          if (var3 >= 2) {
            return;
          } else {
            L2: {
              if (var3 != 1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_7_0;
              if (var4 != 0) {
                stackOut_9_0 = 345;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 50;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var5 = stackIn_10_0;
            var5 = var5 + ((ne) this).field_j;
            var6 = 146;
            on.a(-10 + var5, 126, 265, 270, 10, 65793, 140);
            L4: while (true) {
              if (s.field_M.length > var2) {
                var7 = s.field_M[var2];
                var8 = pb.field_C.c(var7, 245, 16);
                if (var8 + var6 <= 396) {
                  var2++;
                  var6 = var6 + (20 + pb.field_C.a(var7, var5, var6, 245, 999, 16777215, -1, 0, 0, 16) * 16);
                  continue L4;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    private final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ut var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        ut stackIn_12_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        ut stackOut_11_0 = null;
        ut stackOut_10_0 = null;
        L0: {
          var9 = Kickabout.field_G;
          if (ae.field_C == null) {
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
          var2 = stackIn_3_0;
          if (var2 == 0) {
            break L1;
          } else {
            ll.field_g.c(((ne) this).field_j + 490, 112);
            break L1;
          }
        }
        pb.field_C.a(gd.field_g, ((ne) this).field_j + 60, 136, 16777215, -1);
        var3 = 40 + ((ne) this).field_j;
        var4 = 0;
        L2: while (true) {
          if (var4 >= 2) {
            L3: {
              on.a(40 - -((ne) this).field_j, 360, 430, 43, 10, 65793, 140);
              if (ak.field_f == null) {
                break L3;
              } else {
                ak.field_f.c(120 - -((ne) this).field_j, 363);
                break L3;
              }
            }
            L4: {
              if (param0 == -128) {
                break L4;
              } else {
                hd discarded$3 = ne.j((byte) 0);
                break L4;
              }
            }
            L5: {
              int discarded$4 = pb.field_C.a(gf.field_d, 150 + ((ne) this).field_j, 360, 300, 43, 16777215, -1, 0, 1, 16);
              if (var2 != 0) {
                var10 = 0;
                var4 = var10;
                L6: while (true) {
                  if (2 <= var10) {
                    break L5;
                  } else {
                    var5 = ((ne) this).field_j + (50 + var10 * 14);
                    var6 = var10 * 12 + 361;
                    lt.field_d[var10].c(var5, var6);
                    var10++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          } else {
            on.a(var3, 150, 210, 200, 10, 65793, 140);
            un.field_d.a(qq.field_L[var4].toUpperCase(), 20 + var3, 175, 16777215, -1);
            var5 = 0;
            L7: while (true) {
              if (-3 >= (var5 ^ -1)) {
                var3 += 220;
                var4++;
                continue L2;
              } else {
                L8: {
                  var6 = var5 * 120 + (var3 - -20);
                  int discarded$5 = pb.field_C.a(u.field_e[var4][var5], 90 + (var3 - 80 * var5), 84 * var5 + 185, 110, 70, 16777215, -1, var5 << 651795233, 1, 16);
                  var7 = 186 + 74 * var5;
                  if (var5 == 0) {
                    stackOut_11_0 = jn.field_qb;
                    stackIn_12_0 = stackOut_11_0;
                    break L8;
                  } else {
                    stackOut_10_0 = ki.field_q;
                    stackIn_12_0 = stackOut_10_0;
                    break L8;
                  }
                }
                var8 = stackIn_12_0;
                if (var8 != null) {
                  var8.c(var6, var7);
                  var5++;
                  continue L7;
                } else {
                  var5++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3_int = 0;
        int var5 = Kickabout.field_G;
        ip.field_b = new gm[5];
        for (var2 = 0; var2 < ip.field_b.length; var2++) {
            var3_int = 0;
            if (var2 == 1) {
                var3_int = 4;
            }
            if (!(2 != var2)) {
                var3_int = 3;
            }
            if (3 == var2) {
                var3_int = 1;
            }
            if ((var2 ^ -1) == -5) {
                var3_int = 2;
            }
            ip.field_b[var2] = new gm(fp.a(11, 16, 0, var3_int, 0, 0, 31, false, false, false), var3_int, true);
            ip.field_b[var2].field_J = var3_int;
            ip.field_b[var2].g((byte) 127);
            ip.field_b[var2].field_mb.a(dq.a((byte) 79, ip.field_b[var2].field_mb.a(true), new Random()), -61);
        }
        bk.field_a = new gm[2];
        up var6 = new up();
        var6.field_q = 0;
        var6.field_g = 100;
        for (var3_int = 0; -3 < (var3_int ^ -1); var3_int++) {
            bk.field_a[var3_int] = new gm(fp.a(4, 16, var3_int, 0, var3_int, var3_int, 31, false, false, false), 0, true);
            bk.field_a[var3_int].a(true, var6, 3);
        }
        sn.field_k = new ut(200, 300);
        for (var3_int = 0; 9 > var3_int; var3_int++) {
            ((ne) this).field_F[var3_int] = new up();
            ((ne) this).field_K[var3_int] = new kq();
            ((ne) this).field_K[var3_int].field_s = 45 - -(var3_int % 3 * 52);
            ((ne) this).field_K[var3_int].field_J = var3_int / 3 * 75 + 178;
        }
        up var3 = ((ne) this).field_F[1];
        var3.field_n = 8;
        var3.field_g = 27;
        var3.field_l = 12;
        var3.field_o = 25;
        var3.field_e = 10;
        var3.field_q = 3;
        var3.field_r = 24;
        var3 = ((ne) this).field_F[2];
        var3.field_q = 0;
        var3.field_r = 14;
        var3.field_n = 21;
        var3.field_g = 12;
        var3.field_o = 62;
        var3.field_e = 90;
        var3.field_l = 11;
        var3 = ((ne) this).field_F[3];
        var3.field_n = 11;
        var3.field_j = 512;
        if (param0 != -38) {
            ((ne) this).field_K = null;
        }
        var3.field_q = 0;
        var3.field_e = 30;
        var3.field_g = 7;
        var3.field_o = 35;
        var3.field_l = 13;
        var3.field_r = 36;
        var3 = ((ne) this).field_F[5];
        var3.field_e = 50;
        var3.field_l = 14;
        var3.field_n = 82;
        var3.field_o = 12;
        var3.field_q = 1;
        var3.field_r = 98;
        var3.field_g = 35;
        hd var4 = new hd();
        var4.a(true, 350, 0, 0, 350);
        ((ne) this).field_E = new tk(0L, var4, new hd(), rr.field_b);
        ((ne) this).field_E.a(15, 220 + ((ne) this).field_j, 0, (byte) 6, 220, ((ne) this).field_E.field_Db.field_q - -15, 180);
    }

    public static void g(int param0) {
        field_J = null;
        field_G = null;
        if (param0 != 29250) {
            return;
        }
        field_I = null;
        field_H = null;
        field_L = null;
    }

    private final void i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ut var14 = null;
        ut var15 = null;
        ut var16 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        boolean[] stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        boolean[] stackIn_12_0 = null;
        boolean[] stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        boolean[] stackIn_13_0 = null;
        boolean[] stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        boolean[] stackIn_14_0 = null;
        boolean[] stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        boolean[] stackIn_15_0 = null;
        boolean[] stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        boolean[] stackIn_16_0 = null;
        boolean[] stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        boolean[] stackIn_17_0 = null;
        boolean[] stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        boolean[] stackIn_18_0 = null;
        boolean[] stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        boolean[] stackIn_19_0 = null;
        boolean[] stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        boolean[] stackIn_20_0 = null;
        boolean[] stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        boolean[] stackIn_21_0 = null;
        boolean[] stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        boolean[] stackIn_22_0 = null;
        boolean[] stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        ut[] stackIn_26_0 = null;
        ut[] stackIn_27_0 = null;
        ut[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        uo stackIn_30_0 = null;
        String stackIn_30_1 = null;
        uo stackIn_31_0 = null;
        String stackIn_31_1 = null;
        uo stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_38_0 = 0;
        ut[] stackIn_41_0 = null;
        ut[] stackIn_42_0 = null;
        ut[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_46_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        boolean[] stackOut_10_0 = null;
        boolean[] stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        boolean[] stackOut_12_0 = null;
        boolean[] stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        boolean[] stackOut_11_0 = null;
        boolean[] stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        boolean[] stackOut_13_0 = null;
        boolean[] stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        boolean[] stackOut_15_0 = null;
        boolean[] stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        boolean[] stackOut_14_0 = null;
        boolean[] stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        boolean[] stackOut_16_0 = null;
        boolean[] stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        boolean[] stackOut_18_0 = null;
        boolean[] stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        boolean[] stackOut_17_0 = null;
        boolean[] stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        boolean[] stackOut_19_0 = null;
        boolean[] stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        boolean[] stackOut_21_0 = null;
        boolean[] stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        boolean[] stackOut_20_0 = null;
        boolean[] stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        ut[] stackOut_25_0 = null;
        ut[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        ut[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        uo stackOut_29_0 = null;
        String stackOut_29_1 = null;
        uo stackOut_31_0 = null;
        String stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        uo stackOut_30_0 = null;
        String stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        ut[] stackOut_40_0 = null;
        ut[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        ut[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        L0: {
          var13 = Kickabout.field_G;
          if (null == ae.field_C) {
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
          var2 = stackIn_3_0;
          pb.field_C.a(jr.field_Fb, 60 - -((ne) this).field_j, 136, 16777215, -1);
          var3 = ((ne) this).field_j + 40;
          if (param0 == 96) {
            break L1;
          } else {
            ((ne) this).field_F = null;
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          if (2 <= var4) {
            return;
          } else {
            L3: {
              on.a(var3, 150, 275, 250, 10, 65793, 140);
              stackOut_7_0 = 137 + var3;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var4 == 0) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = -60;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 60;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_10_0 + stackIn_10_1;
              un.field_d.a(sa.field_d[var4].toUpperCase(), var3 - -20, 180, 16777215, -1);
              iw.a(param0 ^ -19, sn.field_k);
              on.b();
              bk.field_a[var4].a(950, 300, on.field_g >> 677611265, (on.field_f >> -1867755007) + 60, (byte) -71);
              ta.e(param0 ^ 24);
              var6 = bk.field_a[var4].field_G;
              stackOut_10_0 = new boolean[4];
              stackOut_10_1 = new boolean[4];
              stackOut_10_2 = 0;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              if ((var6 & 2) == 0) {
                stackOut_12_0 = (boolean[]) (Object) stackIn_12_0;
                stackOut_12_1 = (boolean[]) (Object) stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                break L4;
              } else {
                stackOut_11_0 = (boolean[]) (Object) stackIn_11_0;
                stackOut_11_1 = (boolean[]) (Object) stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                break L4;
              }
            }
            L5: {
              stackIn_13_1[stackIn_13_2] = stackIn_13_3 != 0;
              stackOut_13_0 = (boolean[]) (Object) stackIn_13_0;
              stackOut_13_1 = (boolean[]) (Object) stackIn_13_0;
              stackOut_13_2 = 1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              if (-1 == (8 & var6 ^ -1)) {
                stackOut_15_0 = (boolean[]) (Object) stackIn_15_0;
                stackOut_15_1 = (boolean[]) (Object) stackIn_15_1;
                stackOut_15_2 = stackIn_15_2;
                stackOut_15_3 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                stackIn_16_3 = stackOut_15_3;
                break L5;
              } else {
                stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                stackOut_14_1 = (boolean[]) (Object) stackIn_14_1;
                stackOut_14_2 = stackIn_14_2;
                stackOut_14_3 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_16_3 = stackOut_14_3;
                break L5;
              }
            }
            L6: {
              stackIn_16_1[stackIn_16_2] = stackIn_16_3 != 0;
              stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
              stackOut_16_1 = (boolean[]) (Object) stackIn_16_0;
              stackOut_16_2 = 2;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              if (0 == (var6 & 4)) {
                stackOut_18_0 = (boolean[]) (Object) stackIn_18_0;
                stackOut_18_1 = (boolean[]) (Object) stackIn_18_1;
                stackOut_18_2 = stackIn_18_2;
                stackOut_18_3 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                stackIn_19_3 = stackOut_18_3;
                break L6;
              } else {
                stackOut_17_0 = (boolean[]) (Object) stackIn_17_0;
                stackOut_17_1 = (boolean[]) (Object) stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_19_3 = stackOut_17_3;
                break L6;
              }
            }
            L7: {
              stackIn_19_1[stackIn_19_2] = stackIn_19_3 != 0;
              stackOut_19_0 = (boolean[]) (Object) stackIn_19_0;
              stackOut_19_1 = (boolean[]) (Object) stackIn_19_0;
              stackOut_19_2 = 3;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              if ((1 & var6) == 0) {
                stackOut_21_0 = (boolean[]) (Object) stackIn_21_0;
                stackOut_21_1 = (boolean[]) (Object) stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                stackIn_22_3 = stackOut_21_3;
                break L7;
              } else {
                stackOut_20_0 = (boolean[]) (Object) stackIn_20_0;
                stackOut_20_1 = (boolean[]) (Object) stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                break L7;
              }
            }
            L8: {
              stackIn_22_1[stackIn_22_2] = stackIn_22_3 != 0;
              var7 = stackIn_22_0;
              var8 = new int[]{var5 + -50, var5 + 50, var5, var5};
              var9 = new int[]{280, 280, 230, 330};
              if (var2 == 0) {
                break L8;
              } else {
                var10 = 0;
                L9: while (true) {
                  if (var10 >= 4) {
                    break L8;
                  } else {
                    L10: {
                      stackOut_25_0 = ae.field_C[var4][var10];
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_26_0 = stackOut_25_0;
                      if (var7[var10]) {
                        stackOut_27_0 = (ut[]) (Object) stackIn_27_0;
                        stackOut_27_1 = 1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        break L10;
                      } else {
                        stackOut_26_0 = (ut[]) (Object) stackIn_26_0;
                        stackOut_26_1 = 0;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        break L10;
                      }
                    }
                    var14 = stackIn_28_0[stackIn_28_1];
                    var15 = var14;
                    var14.c(var8[var10] + -(var15.field_o >> 1252444641), var9[var10] - (var15.field_v >> 54709281));
                    var10++;
                    continue L9;
                  }
                }
              }
            }
            L11: {
              sn.field_k.f(var5 - (sn.field_k.field_o >> -1975406174), -(sn.field_k.field_v >> -2117450174) + 280);
              stackOut_29_0 = pb.field_C;
              stackOut_29_1 = cu.field_d[var4];
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              if (0 == var4) {
                stackOut_31_0 = (uo) (Object) stackIn_31_0;
                stackOut_31_1 = (String) (Object) stackIn_31_1;
                stackOut_31_2 = 85;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                break L11;
              } else {
                stackOut_30_0 = (uo) (Object) stackIn_30_0;
                stackOut_30_1 = (String) (Object) stackIn_30_1;
                stackOut_30_2 = 0;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                break L11;
              }
            }
            L12: {
              int discarded$1 = ((uo) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2 + 10 + var3, 185, 160, 70, 16777215, -1, 1, 1, 16);
              if (bk.field_a[var4].field_u == 4) {
                if (bk.field_a[var4].field_L > vf.field_I[4] + -13) {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L12;
                } else {
                  stackOut_35_0 = 0;
                  stackIn_38_0 = stackOut_35_0;
                  break L12;
                }
              } else {
                stackOut_33_0 = 0;
                stackIn_38_0 = stackOut_33_0;
                break L12;
              }
            }
            L13: {
              var10 = stackIn_38_0;
              pb.field_C.d(sa.field_c[var4], var3 + 137, 382, 16777215, -1);
              if (var2 != 0) {
                L14: {
                  stackOut_40_0 = kd.field_y[var4];
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_41_0 = stackOut_40_0;
                  if (var10 == 0) {
                    stackOut_42_0 = (ut[]) (Object) stackIn_42_0;
                    stackOut_42_1 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    break L14;
                  } else {
                    stackOut_41_0 = (ut[]) (Object) stackIn_41_0;
                    stackOut_41_1 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    break L14;
                  }
                }
                L15: {
                  var16 = stackIn_43_0[stackIn_43_1];
                  if (var4 == 0) {
                    stackOut_45_0 = 138;
                    stackIn_46_0 = stackOut_45_0;
                    break L15;
                  } else {
                    stackOut_44_0 = 60;
                    stackIn_46_0 = stackOut_44_0;
                    break L15;
                  }
                }
                var12 = stackIn_46_0;
                var16.c(var12 + var3, 324);
                break L13;
              } else {
                break L13;
              }
            }
            var3 += 285;
            var4++;
            continue L2;
          }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        L0: {
          if (param1 < -5) {
            break L0;
          } else {
            boolean discarded$2 = ne.k((byte) 83);
            break L0;
          }
        }
        L1: {
          if (0 == ((ne) this).field_C) {
            L2: {
              if (-99 == (param0 ^ -1)) {
                break L2;
              } else {
                if (99 == param0) {
                  break L2;
                } else {
                  if (-97 == (param0 ^ -1)) {
                    break L2;
                  } else {
                    if (97 != param0) {
                      if ((param0 ^ -1) != -84) {
                        if (param0 == 82) {
                          L3: {
                            if (0 != bk.field_a[1].field_u) {
                              break L3;
                            } else {
                              bk.field_a[1].a((byte) -31, 4);
                              break L3;
                            }
                          }
                          return true;
                        } else {
                          break L1;
                        }
                      } else {
                        L4: {
                          if ((bk.field_a[0].field_u ^ -1) != -1) {
                            break L4;
                          } else {
                            bk.field_a[0].a((byte) -31, 4);
                            break L4;
                          }
                        }
                        return true;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          } else {
            break L1;
          }
        }
        return super.a(param0, -78, param2);
    }

    private final void k(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        on.a(40 + ((ne) this).field_j, 121, 560, 60, 10, 65793, param0);
        int discarded$0 = pb.field_C.a(vc.field_H, ((ne) this).field_j + 55, 131, 530, 40, 16777215, -1, 0, 1, 16);
        int var2 = 40 - -((ne) this).field_j;
        int[][] var3 = new int[][]{new int[4], new int[4]};
        for (var4 = 0; (var4 ^ -1) > -3; var4++) {
            on.a(var2, 190, 275, 208, 10, 65793, 140);
            un.field_d.a(gf.field_e[var4].toLowerCase(), var2 + 10, 212, 16777215, -1);
            for (var5 = 0; (var5 ^ -1) > -5; var5++) {
                pa.field_g[var3[var4][var5]].d(false).c(110 + (var2 + var5 * 40), 200);
            }
            var5 = 242;
            for (var6 = 0; var6 < hv.field_c[var4].length; var6++) {
                var5 = var5 + (10 + 16 * pb.field_C.a(hv.field_c[var4][var6], 10 + var2, var5, 255, 1000, 16777215, -1, 0, 0, 16));
            }
            var2 += 285;
        }
    }

    final static boolean k(byte param0) {
        if (param0 > -22) {
            ne.g(124);
        }
        return k.field_m != null ? true : false;
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          var2 = -1;
          if (param0 == -8494) {
            break L0;
          } else {
            boolean discarded$2 = ((ne) this).a(65, 78, '￩');
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (9 <= var3) {
            gd.a(-1, 178, 45 - -((ne) this).field_j, (byte) -96, var2);
            var3 = 0;
            L2: while (true) {
              if (-10 >= (var3 ^ -1)) {
                on.a(((ne) this).field_j + 40, 120, 560, 50, 10, 65793, 140);
                int discarded$3 = pb.field_C.a(sh.field_e, 70 + ((ne) this).field_j, 126, 500, 40, 16777215, -1, 0, 1, 16);
                on.a(((ne) this).field_j + 210, 178, 390, 225, 10, 65793, 140);
                ((ne) this).field_E.a(94, false);
                pt.a(((ne) this).field_E.field_Gb.field_q + ((ne) this).field_E.field_F, -22914, ((ne) this).field_E.field_F, ((ne) this).field_E.field_T + ((ne) this).field_E.field_Gb.field_mb, ((ne) this).field_E.field_T);
                var3 = ((ne) this).field_E.field_F + 10;
                var4 = 30 + ((ne) this).field_E.field_Db.field_T;
                var5 = var4;
                var6 = 0;
                L3: while (true) {
                  if (-5 >= (var6 ^ -1)) {
                    L4: {
                      var6 = -10 + -var4 + var5;
                      if (var6 != ((ne) this).field_E.field_Db.field_mb) {
                        ((ne) this).field_E.field_Db.field_mb = var6;
                        ((ne) this).field_E.a(15, 0, 0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ta.e(param0 + 8617);
                    return;
                  } else {
                    un.field_d.a(bl.field_d[var6].toLowerCase(), var3 + -6, var5, 16777215, -1);
                    eo.a(200 + var3, -12 + var5, 10 + 17 * ((1 + var6) % 4) % 30, var6, true, 0);
                    var5 += 6;
                    var5 = var5 + pb.field_C.a(ng.field_k[var6], var3 - 5, var5, 340, 1000, 14540253, -1, 0, 0, 17) * 17;
                    var5 += 50;
                    var6++;
                    continue L3;
                  }
                }
              } else {
                ((ne) this).field_K[var3].field_s = ((ne) this).field_j + 45 - -(var3 % 3 * 52);
                ((ne) this).field_K[var3].b(0, false);
                ((ne) this).field_K[var3].h((byte) -122);
                var3++;
                continue L2;
              }
            }
          } else {
            if (((ne) this).field_K[var3].field_gb) {
              if (!((ne) this).field_K[var3].field_Eb.c(-2)) {
                var2 = var3;
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    ne() {
        ((ne) this).field_F = new up[9];
        ((ne) this).field_K = new kq[9];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Login: ";
        field_L = "(MAX)";
        field_H = "Ask to join <%0>'s game";
        field_G = new boolean[112];
    }
}
