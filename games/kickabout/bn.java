/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends qt {
    static String field_C;
    static ut[] field_E;
    private int field_D;
    static ut[] field_B;
    static int field_A;
    static ut field_G;
    static String[] field_F;

    final int b(int param0, int param1) {
        if (la.a(100)) {
            if (!(param0 != 0)) {
                return 25 + (((bn) this).field_i[0].field_d >> 2053342177);
            }
            if (!(-2 != (param0 ^ -1))) {
                return -(((bn) this).field_i[1].field_d >> 14392225) + 340;
            }
        }
        if (param1 != -22667) {
            return -84;
        }
        return super.b(param0, -22667);
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        mf.field_Gb = -1;
        je.field_k = tu.field_E.field_t;
        uv.field_f = false;
        bf.field_y.b(72);
        nq.b(je.field_k, 500);
    }

    final static String a(char param0, byte param1) {
        if (param1 != -83) {
            bn.e(77);
        }
        return String.valueOf(param0);
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        super.a(param0, param1, -116, param3);
        if (param2 >= -28) {
            field_F = null;
        }
        io.field_e.a(true, 640, ((bn) this).field_j, 0, 480);
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_27_0 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var8 = Kickabout.field_G;
          super.a((byte) -71, param1);
          stackOut_0_0 = param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (la.a(100)) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          param1 = stackIn_3_0 & stackIn_3_1 != 0;
          stackOut_3_0 = param1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (rr.field_f) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          param1 = stackIn_6_0 & stackIn_6_1 != 0;
          if (((bn) this).field_D > 0) {
            ((bn) this).field_D = ((bn) this).field_D - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var3 = jh.field_Hb.field_Db.field_J;
          io.field_e.b(0, param1);
          w.field_b.b(11570);
          var4 = -32 % ((38 - param0) / 60);
          if (wh.field_w >= -1) {
            break L3;
          } else {
            wh.field_w = wh.field_w - 1;
            break L3;
          }
        }
        L4: {
          var5 = je.field_k;
          if (-21 <= sd.field_b - -un.field_d.a(gu.field_Jb)) {
            sd.field_b = sd.field_b - 1;
            break L4;
          } else {
            sd.field_b = 370;
            break L4;
          }
        }
        var6 = 0;
        var7 = 0;
        L5: while (true) {
          if (var7 >= ha.field_H.length) {
            L6: {
              if (1 != np.field_Cb.field_sb) {
                break L6;
              } else {
                if (w.field_b.j((byte) -16).length() > 0) {
                  sp.a(w.field_b.j((byte) -16), (byte) 74);
                  w.field_b.b("", -23174);
                  kj.a((byte) -105);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              L8: {
                if (!uv.field_f) {
                  break L8;
                } else {
                  ri.field_t = ri.field_t - 1;
                  if ((ri.field_t - 1 ^ -1) >= -1) {
                    break L8;
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    break L7;
                  }
                }
              }
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L7;
            }
            L9: {
              uv.field_f = stackIn_27_0 != 0;
              jh.field_Hb.b(0, param1);
              jh.field_Hb.a(32 * id.field_v, false, (byte) -111, 32);
              if (var6 != 0) {
                break L9;
              } else {
                L10: {
                  var7 = vc.a(18, -(jh.field_Hb.field_Db.field_J + 5), (byte) -72);
                  bf.field_y.a(30 + var7, -20 + var7, -108);
                  re.a((byte) 125, -10 + var7, var7 + 20, var5);
                  if (mf.field_Gb != var7) {
                    break L10;
                  } else {
                    if (je.field_k == var5) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                je.field_k = var5;
                mf.field_Gb = var7;
                qh.a(89);
                break L9;
              }
            }
            L11: {
              if (!w.field_b.field_gb) {
                break L11;
              } else {
                qd.a((byte) -67, ht.field_a);
                break L11;
              }
            }
            var7 = 0;
            L12: while (true) {
              if (var7 >= ha.field_H.length) {
                L13: {
                  if (jh.field_Hb.field_Db.field_J <= var3) {
                    break L13;
                  } else {
                    if (((bn) this).field_D != 0) {
                      break L13;
                    } else {
                      wh discarded$2 = sp.c(59, 76);
                      ((bn) this).field_D = 5;
                      break L13;
                    }
                  }
                }
                L14: {
                  if (jh.field_Hb.field_Db.field_J >= var3) {
                    break L14;
                  } else {
                    if (0 == ((bn) this).field_D) {
                      wh discarded$3 = sp.c(60, -118);
                      ((bn) this).field_D = 5;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                return;
              } else {
                if (ha.field_H[var7].field_gb) {
                  qd.a((byte) -67, vo.a((byte) -18, fu.field_f, new String[1]));
                  var7++;
                  continue L12;
                } else {
                  var7++;
                  continue L12;
                }
              }
            }
          } else {
            if (-2 == (ha.field_H[var7].field_sb ^ -1)) {
              nq.b(var7, 500);
              je.field_k = var7;
              mf.field_Gb = 0;
              var5 = var7;
              jh.field_Hb.field_Db.field_J = 0;
              kj.a((byte) 80);
              var6 = 1;
              var7++;
              continue L5;
            } else {
              var7++;
              continue L5;
            }
          }
        }
    }

    final void b(int param0) {
        hd var3 = null;
        hd var4 = null;
        hd var5 = null;
        int var6 = 0;
        int var7 = 0;
        hd var8 = null;
        L0: {
          var7 = Kickabout.field_G;
          if (gu.field_Jb != null) {
            break L0;
          } else {
            gu.field_Jb = om.field_zb;
            if (la.a(100)) {
              gu.field_Jb = qh.field_g;
              break L0;
            } else {
              break L0;
            }
          }
        }
        io.field_e = new hd();
        io.field_e.a(true, 640, 0, 0, 480);
        var8 = new hd();
        var8.field_A = 1;
        var8.field_p = 1;
        var8.field_y = 16777215;
        var8.field_X = (hu) (Object) q.field_d;
        var3 = new hd();
        var3.a(true, 317, 5, 5, 18);
        jh.field_Hb = new tk(0L, var3, var8, rr.field_b);
        jh.field_Hb.a(15, 20, 2, (byte) 37, 230, 344, 175);
        jh.field_Hb.field_A = 1;
        jh.field_Hb.field_y = 16777215;
        jh.field_Hb.field_p = 1;
        jh.field_Hb.field_X = (hu) (Object) q.field_d;
        var4 = ag.a(16006912, param0 ^ param0);
        var5 = new hd();
        var5.field_y = 16777215;
        var5.field_B = 2;
        var5.field_X = (hu) (Object) q.field_d;
        var5.field_D = 5;
        w.field_b = new vg(0L, var8, var4, var5, 20);
        w.field_b.a(param0 + -592, 145, 64, 4 + (q.field_d.field_G + q.field_d.field_p), 160);
        var8.field_X = (hu) (Object) q.field_d;
        w.field_b.field_R = null;
        np.field_Cb = eo.a(ic.field_j, 7126504);
        np.field_Cb.a(true, np.field_Cb.field_q, 310, 61, np.field_Cb.field_mb);
        ha.field_H = new hd[7];
        var6 = 6;
        L1: while (true) {
          if ((var6 ^ -1) > -1) {
            L2: {
              io.field_e.a((byte) -126, (hd) (Object) jh.field_Hb);
              io.field_e.a((byte) -106, (hd) (Object) w.field_b);
              io.field_e.a((byte) -112, np.field_Cb);
              if (!la.a(100)) {
                sp.a(ow.field_e, (byte) 74);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            ha.field_H[var6] = new hd();
            ha.field_H[var6].a(true, 48, 20 - -(50 * var6), 96, 48);
            io.field_e.a((byte) -127, ha.field_H[var6]);
            var6--;
            continue L1;
          }
        }
    }

    public static void e(int param0) {
        field_E = null;
        field_G = null;
        if (param0 > -31) {
            field_B = null;
        }
        field_B = null;
        field_C = null;
        field_F = null;
    }

    final boolean a(int param0, int param1, char param2) {
        String var4 = null;
        if (param1 > -5) {
            String discarded$0 = bn.a('c', (byte) -84);
        }
        boolean discarded$2 = super.a(param0, -11, param2);
        if (!la.a(100)) {
            if (w.field_b.a(param0, param2, 875)) {
                return true;
            }
        }
        if (!la.a(100)) {
            if (param0 == -85) {
                var4 = w.field_b.j((byte) -16);
                if (-1 < var4.length()) {
                    sp.a(w.field_b.j((byte) -16), (byte) 74);
                    w.field_b.b("", -23174);
                    kj.a((byte) -115);
                }
            }
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        ji var3 = null;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        cf var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        hd stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        hd stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        hd stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        hd stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        hd stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        hd stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        hd stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        hd stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var6 = Kickabout.field_G;
          on.a(jh.field_Hb.field_F + ((bn) this).field_j, -4 + jh.field_Hb.field_T, jh.field_Hb.field_q - -4, jh.field_Hb.field_mb + 6, 0, 128);
          on.a(((bn) this).field_j - -20, 60, 134 + w.field_b.field_q - -np.field_Cb.field_q, 29, 10, 0, 128);
          q.field_d.c(bi.field_e.toUpperCase(), w.field_b.field_F, w.field_b.field_T - -15, 16777215, -1);
          on.a(w.field_b.field_F, w.field_b.field_T - -4, w.field_b.field_q, w.field_b.field_mb + -5, 7829367, 128);
          if (!jh.field_Hb.field_Eb.e((byte) -113)) {
            break L0;
          } else {
            var3 = jh.field_Hb.field_Eb;
            on.g(3 + (((hd) (Object) var3).field_F + ((bn) this).field_j), ((hd) (Object) var3).field_T, ((hd) (Object) var3).field_q + -6, ((hd) (Object) var3).field_mb);
            break L0;
          }
        }
        pt.a(640, -22914, 0, 135, 60);
        var3_int = 0;
        L1: while (true) {
          if (ha.field_H.length <= var3_int) {
            L2: {
              ta.e(param0 ^ -122);
              on.a(20 + je.field_k * 50 + ((bn) this).field_j, 135, 48, 2, 0);
              on.a(20 + ((bn) this).field_j, 137, 348, 26, 0);
              var3 = (ji) (Object) lh.field_C;
              if ((je.field_k ^ -1) >= -1) {
                break L2;
              } else {
                if (je.field_k < q.field_h.length) {
                  var3_ref = q.field_h[je.field_k];
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              un.field_d.d(var3_ref.toLowerCase(), ((bn) this).field_j + 194, 156, 16679959, -1);
              var4 = un.field_d.a(var3_ref.toLowerCase());
              if (eo.field_f != null) {
                eo.field_f[je.field_k].a(194 + ((bn) this).field_j - (var4 >> 1773490049) + -28, 146);
                eo.field_f[je.field_k].a(14 + ((var4 >> 323550113) + ((bn) this).field_j) + 194, 146);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                stackOut_21_0 = io.field_e;
                stackOut_21_1 = 85;
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (!pn.g(2368)) {
                  break L5;
                } else {
                  stackOut_22_0 = (hd) (Object) stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  if (-251L >= (nj.a(127) % 500L ^ -1L)) {
                    break L5;
                  } else {
                    stackOut_23_0 = (hd) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    break L4;
                  }
                }
              }
              stackOut_24_0 = (hd) (Object) stackIn_24_0;
              stackOut_24_1 = stackIn_24_1;
              stackOut_24_2 = 0;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            }
            L6: {
              ((hd) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2 != 0);
              if (jh.field_Hb.field_Db.field_jb == null) {
                break L6;
              } else {
                pt.a(-2 + jh.field_Hb.field_q + (jh.field_Hb.field_F - 15), -22914, jh.field_Hb.field_F, 12 + (jh.field_Hb.field_T - (-jh.field_Hb.field_mb + 15)), jh.field_Hb.field_T);
                var7 = (cf) (Object) jh.field_Hb.field_Db.field_jb.g(24009);
                L7: while (true) {
                  if (var7 == null) {
                    ta.e(118);
                    break L6;
                  } else {
                    var7.b(-104);
                    var7 = (cf) (Object) jh.field_Hb.field_Db.field_jb.c(param0 ^ -38);
                    continue L7;
                  }
                }
              }
            }
            L8: {
              L9: {
                if (jh.field_Hb.field_Db.field_jb == null) {
                  break L9;
                } else {
                  if (jh.field_Hb.field_Db.field_jb.a(false) == 0) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              if (!la.a(100)) {
                if (!uv.field_f) {
                  un.field_d.d(lo.field_k.toLowerCase(), 194 - -((bn) this).field_j, 290, 16777215, -1);
                  break L8;
                } else {
                  jr.a(((bn) this).field_j + 194, -65, 290);
                  break L8;
                }
              } else {
                pb.field_C.d(sh.field_b, ((bn) this).field_j + 194, 290, 16777215, -1);
                break L8;
              }
            }
            L10: {
              on.a(jh.field_Hb.field_F, 4 + (jh.field_Hb.field_mb + jh.field_Hb.field_T), 4 + jh.field_Hb.field_q, 24, 0, 196);
              pt.a(jh.field_Hb.field_F + (jh.field_Hb.field_q - -2), -22914, 1 + jh.field_Hb.field_F, jh.field_Hb.field_T + (jh.field_Hb.field_mb - -4) - -24, 4 + (jh.field_Hb.field_mb + jh.field_Hb.field_T));
              if (wh.field_w > 0) {
                un.field_d.d(qh.field_e.toLowerCase(), (jh.field_Hb.field_q >> -1759026079) + jh.field_Hb.field_F, 423, 16679959, -1);
                break L10;
              } else {
                un.field_d.a(gu.field_Jb.toLowerCase(), sd.field_b + ((bn) this).field_j, 423, 16679959, -1);
                break L10;
              }
            }
            L11: {
              L12: {
                ta.e(param0 + 128);
                if (la.a(100)) {
                  break L12;
                } else {
                  if (!rr.field_f) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              on.g(((bn) this).field_j, 48, 450, 382);
              if (rr.field_f) {
                int discarded$1 = pb.field_C.a(pi.field_d, ((bn) this).field_j, 48, 450, 382, 16777215, -1, 1, 1, 0);
                break L11;
              } else {
                break L11;
              }
            }
            super.a(param0, param1);
            return;
          } else {
            L13: {
              if (je.field_k != var3_int) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L13;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L13;
              }
            }
            L14: {
              var4 = stackIn_7_0;
              if (var4 != 0) {
                stackOut_9_0 = 256;
                stackIn_10_0 = stackOut_9_0;
                break L14;
              } else {
                stackOut_8_0 = 128;
                stackIn_10_0 = stackOut_8_0;
                break L14;
              }
            }
            var5 = stackIn_10_0;
            on.a(ha.field_H[var3_int].field_F, ha.field_H[var3_int].field_T, ha.field_H[var3_int].field_q, ha.field_H[var3_int].field_mb, 10, 0, var5);
            if (var4 == 0) {
              jm.field_i[var3_int].b(ha.field_H[var3_int].field_F - -4, ha.field_H[var3_int].field_T + -2, 48);
              var3_int++;
              continue L1;
            } else {
              kb.field_E[var3_int].c(ha.field_H[var3_int].field_F + 4, ha.field_H[var3_int].field_T + -2);
              var3_int++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        super.a(param0, 121);
        if (param1 < 99) {
            field_E = null;
        }
    }

    bn() {
        ((bn) this).field_D = 0;
    }

    final int a(int param0, int param1) {
        int var3 = 33 / ((-49 - param0) / 52);
        return super.a(-111, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "buyout at min";
        field_A = 3;
        field_G = null;
        field_F = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
