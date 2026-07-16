/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class h extends bj implements rj, qb {
    private boolean field_K;
    private hc field_N;
    private boolean field_M;
    static String field_O;
    private boolean field_P;
    private ul field_L;
    private ul field_J;
    private hc field_G;
    private String field_H;
    private hc field_I;

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (((h) this).field_G == param0) {
            this.a((byte) 103);
            break L0;
          } else {
            if (((h) this).field_N == param0) {
              fe.a((byte) -83);
              break L0;
            } else {
              if (((h) this).field_I == param0) {
                if (!((h) this).field_K) {
                  if (((h) this).field_P) {
                    qe.a(true);
                    break L0;
                  } else {
                    ta.m(2);
                    break L0;
                  }
                } else {
                  fh.b(-54);
                  break L0;
                }
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (param3 == 1) {
            break L1;
          } else {
            ((h) this).field_H = null;
            break L1;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != ((h) this).field_H) {
            int discarded$0 = sb.field_a.a(((h) this).field_H, 20 + (((h) this).field_k + param3), ((h) this).field_j + (param0 + 15), -40 + ((h) this).field_g, ((h) this).field_x, 16777215, -1, 1, 0, sb.field_a.field_r);
        }
        if (null != ((h) this).field_N) {
            em.e(10 + param3, 134 + param0, ((h) this).field_g - 20, 4210752);
        }
        if (param1 < 85) {
            ((h) this).field_H = null;
        }
        super.a(param0, (byte) 87, param2, param3);
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        Object var6 = null;
        if (super.a(param0, param1, param2, 60)) {
          return true;
        } else {
          if ((param2 ^ -1) == -99) {
            return ((h) this).a((byte) 22, param0);
          } else {
            if (param2 == 99) {
              return ((h) this).a(param0, true);
            } else {
              L0: {
                if (param3 > 0) {
                  break L0;
                } else {
                  var6 = null;
                  ((h) this).a((ul) null, -39);
                  break L0;
                }
              }
              return false;
            }
          }
        }
    }

    public final void a(boolean param0, ul param1) {
        if (!(param1 != ((h) this).field_L)) {
            boolean discarded$0 = ((h) this).field_J.a(-4659, (hm) this);
        }
        if (((h) this).field_J == param1) {
            this.a((byte) 100);
        }
        if (!param0) {
            ((h) this).field_H = null;
        }
    }

    final static void a(mf param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        ia var5 = null;
        int[] var6 = null;
        int var7 = 0;
        c var8 = null;
        int var9 = 0;
        c var10 = null;
        L0: {
          var7 = EscapeVector.field_A;
          var8 = new c(param0.a(-4, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.e(0);
          var10.l(-17928);
          tj.field_y = hg.a(var10, 22178);
          fh.field_e = new ia[var3];
          jg.field_c = new int[var3][];
          if (param1 >= 41) {
            break L0;
          } else {
            int discarded$1 = h.a(82, (byte) -78);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var3 <= var4) {
            var10.o(-3879);
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = fh.field_e[var9];
                var5.a(6, 1, 6, 6, -72);
                var5.a((byte) 49);
                var6 = new int[]{var5.field_b - -var5.field_a >> -1524691999, var5.field_R + var5.field_i >> 931046849, var5.field_O + var5.field_g >> -223174815};
                jg.field_c[var9] = var6;
                var5.a(-var6[2], 0, -var6[0], -var6[1]);
                var9++;
                continue L2;
              }
            }
          } else {
            fh.field_e[var4] = wk.a(-127, var8);
            var4++;
            continue L1;
          }
        }
    }

    final String j(int param0) {
        Object var3 = null;
        L0: {
          if (param0 == 35) {
            break L0;
          } else {
            var3 = null;
            ((h) this).a((hc) null, 35, 44, 83, 31);
            break L0;
          }
        }
        if (null == ((h) this).field_L.field_l) {
          return "";
        } else {
          return ((h) this).field_L.field_l;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = ua.field_c.a(29386, param0);
        if (param1 != 121) {
            field_O = null;
        }
        int var3 = je.a(false, param0);
        if (var2 >= var3) {
            var2 = 0;
        } else {
            if (!(var2 != 0)) {
                var2 = hn.field_l.field_s;
            }
        }
        return var2;
    }

    public final void a(ul param0, int param1) {
        if (param1 != 0) {
            ((h) this).field_J = null;
        }
    }

    final void h(byte param0) {
        if (param0 >= -127) {
            ((h) this).field_N = null;
        }
        ((h) this).field_L.h((byte) -29);
        ((h) this).field_J.h((byte) -29);
    }

    private final void a(byte param0) {
        Object var3 = null;
        L0: {
          if (param0 > 88) {
            break L0;
          } else {
            var3 = null;
            ((h) this).a(true, (ul) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (gm.b(8192)) {
              break L2;
            } else {
              if (((h) this).field_L.field_l.length() >= -1) {
                break L1;
              } else {
                if (-1 >= ((h) this).field_J.field_l.length()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          mi.a(0, ((h) this).field_J.field_l, ((h) this).field_L.field_l);
          break L1;
        }
    }

    h(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (db) null);
        ck var6 = null;
        wl var7 = null;
        String var8 = null;
        ee var9 = null;
        ki var12 = null;
        ki var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        hc stackIn_16_1 = null;
        hc stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hc stackIn_17_1 = null;
        hc stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hc stackIn_18_1 = null;
        hc stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        hc stackOut_15_1 = null;
        hc stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        hc stackOut_17_1 = null;
        hc stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        hc stackOut_16_1 = null;
        hc stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((h) this).field_P = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((h) this).field_M = stackIn_6_1 != 0;
          ((h) this).field_H = param1;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((h) this).field_K = stackIn_9_1 != 0;
          if (!((h) this).field_K) {
            break L3;
          } else {
            L4: {
              if (((h) this).field_M) {
                break L4;
              } else {
                if (!((h) this).field_P) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((h) this).field_L = (ul) (Object) new gd(param0, (wn) this, 100);
          ((h) this).field_J = (ul) (Object) new gd("", (wn) this, 20);
          if (!((h) this).field_K) {
            L6: {
              ((h) this).field_G = new hc(ta.field_g, (wn) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((h) this).field_P) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = cj.field_c;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = li.field_O;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            ((h) this).field_I = new hc(stackIn_18_3, (wn) null);
            if (!((h) this).field_M) {
              break L5;
            } else {
              ((h) this).field_N = new hc(pc.field_g, (wn) this);
              break L5;
            }
          } else {
            ((h) this).field_G = new hc(sh.field_s, (wn) null);
            ((h) this).field_I = new hc(d.field_d, (wn) null);
            ((h) this).field_L.field_y = false;
            break L5;
          }
        }
        L7: {
          ((h) this).field_L.field_s = (db) (Object) new re(10000536);
          ((h) this).field_J.field_s = (db) (Object) new un(10000536);
          var6 = new ck();
          ((h) this).field_G.field_s = (db) (Object) var6;
          if (((h) this).field_I == null) {
            break L7;
          } else {
            ((h) this).field_I.field_s = (db) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (null == ((h) this).field_N) {
            break L8;
          } else {
            ((h) this).field_N.field_s = (db) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((h) this).field_L.field_i = cd.field_u;
          if (((h) this).field_N == null) {
            break L9;
          } else {
            ((h) this).field_N.field_i = mm.field_c;
            break L9;
          }
        }
        L10: {
          if (!((h) this).field_K) {
            if (!((h) this).field_P) {
              ((h) this).field_I.field_s = (db) (Object) new ha();
              break L10;
            } else {
              ((h) this).field_I.field_i = lf.field_G;
              ((h) this).field_I.field_s = (db) (Object) new ha();
              break L10;
            }
          } else {
            ((h) this).field_I.field_i = gd.field_Z;
            break L10;
          }
        }
        L11: {
          ((h) this).field_j = 15;
          var7 = sb.field_a;
          if (null == ((h) this).field_H) {
            break L11;
          } else {
            ((h) this).field_j = ((h) this).field_j + (var7.b(((h) this).field_H, -40 + ((h) this).field_g, var7.field_r) + 5);
            break L11;
          }
        }
        L12: {
          var8 = lh.field_b;
          var9 = sh.a((byte) -1, oc.d((byte) -107));
          if (var9 == kf.field_q) {
            var8 = kg.field_b;
            break L12;
          } else {
            if (var9 != oh.field_n) {
              break L12;
            } else {
              var8 = wi.field_c;
              break L12;
            }
          }
        }
        L13: {
          ki dupTemp$2 = new ki(10, ((h) this).field_j, -20 + ((h) this).field_g, 25, (hm) (Object) ((h) this).field_L, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$2;
          ((h) this).b((hm) (Object) dupTemp$2, false);
          ((h) this).field_j = ((h) this).field_j + (((hm) (Object) var12).field_x + 5);
          ki dupTemp$3 = new ki(10, ((h) this).field_j, ((h) this).field_g + -20, 25, (hm) (Object) ((h) this).field_J, false, 80, 3, var7, 16777215, qc.field_vb);
          var13 = dupTemp$3;
          ((h) this).b((hm) (Object) dupTemp$3, false);
          ((h) this).field_j = ((h) this).field_j + (((hm) (Object) var13).field_x - -5);
          ((h) this).field_G.field_q = (wn) this;
          if (((h) this).field_N == null) {
            break L13;
          } else {
            ((h) this).field_N.field_q = (wn) this;
            break L13;
          }
        }
        L14: {
          if (null == ((h) this).field_I) {
            break L14;
          } else {
            ((h) this).field_I.field_q = (wn) this;
            break L14;
          }
        }
        L15: {
          if (((h) this).field_N == null) {
            ((h) this).field_G.a(-10 + (-6 + ((h) this).field_g), ((h) this).field_j, 8, true, 30);
            ((h) this).field_j = ((h) this).field_j + 35;
            break L15;
          } else {
            ((h) this).field_G.a(-95 + ((h) this).field_g, ((h) this).field_j, 85, true, 30);
            ((h) this).field_j = ((h) this).field_j + 60;
            break L15;
          }
        }
        L16: {
          if (((h) this).field_N == null) {
            break L16;
          } else {
            ((h) this).field_N.a(((h) this).field_g - 6 + -10, ((h) this).field_j, 8, true, 30);
            ((h) this).field_j = ((h) this).field_j + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((h) this).field_I) {
            break L17;
          } else {
            L18: {
              if (((h) this).field_K) {
                break L18;
              } else {
                if (!((h) this).field_P) {
                  ((h) this).field_I.a(40, ((h) this).field_j, 8, true, 20);
                  ((h) this).field_j = ((h) this).field_j + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((h) this).field_I.a(-6 + (((h) this).field_g + -10), ((h) this).field_j, 8, true, 30);
            ((h) this).field_j = ((h) this).field_j + 35;
            break L17;
          }
        }
        L19: {
          ((h) this).a(((h) this).field_g, 0, 0, true, 3 + ((h) this).field_j);
          ((h) this).b((hm) (Object) ((h) this).field_G, false);
          if (((h) this).field_N == null) {
            break L19;
          } else {
            ((h) this).b((hm) (Object) ((h) this).field_N, false);
            break L19;
          }
        }
        L20: {
          if (null == ((h) this).field_I) {
            break L20;
          } else {
            ((h) this).b((hm) (Object) ((h) this).field_I, false);
            break L20;
          }
        }
    }

    public static void k(int param0) {
        if (param0 <= 94) {
            field_O = null;
        }
        field_O = null;
    }

    final void a(String param0, byte param1) {
        ul var3 = null;
        String var4 = null;
        if (param1 <= 105) {
          return;
        } else {
          var3 = ((h) this).field_L;
          var4 = param0;
          var3.a(var4, false, -33);
          ((h) this).field_J.h((byte) -29);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Rewatch last briefing";
    }
}
