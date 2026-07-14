/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ul extends gj implements nk, da {
    private boolean field_K;
    private bb field_N;
    static String field_F;
    private boolean field_P;
    private bb field_I;
    private boolean field_M;
    private String field_O;
    private c field_H;
    private bb field_L;
    private c field_J;
    static pl field_G;

    final String j(int param0) {
        if (!(((ul) this).field_H.field_i != null)) {
            return "";
        }
        if (param0 != -1) {
            return null;
        }
        return ((ul) this).field_H.field_i;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (null != ((ul) this).field_O) {
            int discarded$0 = ug.field_e.a(((ul) this).field_O, 20 + ((ul) this).field_y + param1, 15 + ((ul) this).field_z + param0, -40 + ((ul) this).field_u, ((ul) this).field_j, 16777215, -1, 1, 0, ug.field_e.field_H);
        }
        if (!(((ul) this).field_N == null)) {
            gb.b(param1 + 10, param0 + 134, ((ul) this).field_u + -20, 4210752);
        }
        super.b(param0, param1, param2, param3);
    }

    private final void e(byte param0) {
        if (!o.c((byte) 39)) {
            // if_icmpge L62
            // if_icmpge L62
        }
        pc.a(false, ((ul) this).field_H.field_i, ((ul) this).field_J.field_i);
        if (param0 != -32) {
            ((ul) this).field_P = false;
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (-99 == param1) {
            return ((ul) this).b(param2, -28533);
          } else {
            if (-100 != param1) {
              return false;
            } else {
              return ((ul) this).a(32, param2);
            }
          }
        }
    }

    public final void a(int param0, c param1) {
        if (!(param1 != ((ul) this).field_H)) {
            boolean discarded$0 = ((ul) this).field_J.a((qa) this, -123);
        }
        if (((ul) this).field_J == param1) {
            this.e((byte) -32);
        }
        if (param0 != -31825) {
            ((ul) this).field_N = null;
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          nf.field_K = (param1 & 48) >> 1801709604;
          if ((nf.field_K ^ -1) >= -3) {
            break L0;
          } else {
            nf.field_K = 2;
            break L0;
          }
        }
        if (param0 != 18398) {
          return;
        } else {
          L1: {
            fk.field_C = (param1 & 13) >> 484175330;
            oj.field_k = param1 & 3;
            if (2 >= fk.field_C) {
              break L1;
            } else {
              fk.field_C = 2;
              break L1;
            }
          }
          L2: {
            if ((oj.field_k ^ -1) >= -3) {
              break L2;
            } else {
              oj.field_k = 2;
              break L2;
            }
          }
          return;
        }
    }

    public final void b(int param0, c param1) {
        if (param0 != 40) {
            ((ul) this).field_M = true;
        }
    }

    final static void c(boolean param0) {
        kb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fa var6 = null;
        fa var7 = null;
        var5 = fleas.field_A ? 1 : 0;
        var6 = tl.field_p;
        var7 = var6;
        if (!param0) {
          return;
        } else {
          L0: {
            var2 = (kb) (Object) pb.field_f.c((byte) 47);
            if (var2 != null) {
              L1: {
                var4 = hi.field_q;
                if ((var4 ^ -1) <= -81) {
                  if ((var4 ^ -1) <= -231) {
                    var3 = 123 - var4 / 2;
                    break L1;
                  } else {
                    var3 = 8;
                    break L1;
                  }
                } else {
                  var3 = var4 / 2 + -32;
                  break L1;
                }
              }
              gb.g(0, -4 + var3, var6.b(wa.field_f[var2.field_q]) + 64, 40, 16755200, 128);
              gb.e(0, var3 + -4, var6.b(wa.field_f[var2.field_q]) + 64, 40, 16746496, 128);
              il.field_d[var2.field_q].c(8, var3);
              var6.c(wa.field_f[var2.field_q], 48, var3 + var7.field_H, 0, -1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void k(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != 16777215) {
            ul.k(-9);
        }
    }

    final void a(byte param0, String param1) {
        c var3 = ((ul) this).field_H;
        String var4 = param1;
        if (param0 > -100) {
            ((ul) this).field_P = false;
        }
        var3.a(false, (byte) -127, var4);
        ((ul) this).field_J.r(32);
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        if (param3 != 248) {
          return;
        } else {
          L0: {
            if (((ul) this).field_I != param4) {
              if (((ul) this).field_N != param4) {
                if (((ul) this).field_L != param4) {
                  break L0;
                } else {
                  if (!((ul) this).field_P) {
                    if (((ul) this).field_K) {
                      ej.a(param3 ^ 232);
                      break L0;
                    } else {
                      td.g(param3 ^ 252);
                      break L0;
                    }
                  } else {
                    vi.c((byte) -124);
                    break L0;
                  }
                }
              } else {
                oh.d(false);
                break L0;
              }
            } else {
              this.e((byte) -32);
              break L0;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        ((ul) this).field_H.r(32);
        int var2 = 38 / ((29 - param0) / 45);
        ((ul) this).field_J.r(32);
    }

    ul(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ch) null);
        ri var6 = null;
        fa var7 = null;
        String var8 = null;
        wh var9 = null;
        ml var12 = null;
        ml var13 = null;
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
        Object stackIn_15_0 = null;
        bb stackIn_15_1 = null;
        bb stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        bb stackIn_16_1 = null;
        bb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        bb stackIn_17_1 = null;
        bb stackIn_17_2 = null;
        String stackIn_17_3 = null;
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
        Object stackOut_14_0 = null;
        bb stackOut_14_1 = null;
        bb stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        bb stackOut_16_1 = null;
        bb stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        bb stackOut_15_1 = null;
        bb stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((ul) this).field_M = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param4) {
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
          ((ul) this).field_K = stackIn_6_1 != 0;
          ((ul) this).field_O = param1;
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
          ((ul) this).field_P = stackIn_9_1 != 0;
          if (!((ul) this).field_P) {
            break L3;
          } else {
            L4: {
              if (((ul) this).field_M) {
                break L4;
              } else {
                if (!((ul) this).field_K) {
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
          ((ul) this).field_H = (c) (Object) new bc(param0, (kd) this, 100);
          ((ul) this).field_J = (c) (Object) new bc("", (kd) this, 20);
          if (((ul) this).field_P) {
            ((ul) this).field_I = new bb(uh.field_o, (kd) null);
            ((ul) this).field_L = new bb(vk.field_K, (kd) null);
            ((ul) this).field_H.field_D = false;
            break L5;
          } else {
            L6: {
              ((ul) this).field_I = new bb(wi.field_h, (kd) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((ul) this).field_K) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = mi.field_k;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = tc.field_g;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new bb(stackIn_17_3, (kd) null);
            ((ul) this).field_L = stackIn_17_1;
            if (!((ul) this).field_M) {
              break L5;
            } else {
              ((ul) this).field_N = new bb(qk.field_h, (kd) this);
              break L5;
            }
          }
        }
        L7: {
          ((ul) this).field_H.field_p = (ch) (Object) new aa(10000536);
          ((ul) this).field_J.field_p = (ch) (Object) new mh(10000536);
          var6 = new ri();
          ((ul) this).field_I.field_p = (ch) (Object) var6;
          if (((ul) this).field_L == null) {
            break L7;
          } else {
            ((ul) this).field_L.field_p = (ch) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ul) this).field_H.field_m = uf.field_l;
          if (((ul) this).field_N == null) {
            break L8;
          } else {
            ((ul) this).field_N.field_p = (ch) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (((ul) this).field_N == null) {
            break L9;
          } else {
            ((ul) this).field_N.field_m = se.field_f;
            break L9;
          }
        }
        L10: {
          if (!((ul) this).field_P) {
            if (((ul) this).field_K) {
              ((ul) this).field_L.field_m = ga.field_n;
              ((ul) this).field_L.field_p = (ch) (Object) new me();
              break L10;
            } else {
              ((ul) this).field_L.field_p = (ch) (Object) new me();
              break L10;
            }
          } else {
            ((ul) this).field_L.field_m = db.field_F;
            break L10;
          }
        }
        L11: {
          ((ul) this).field_z = 15;
          var7 = ug.field_e;
          if (((ul) this).field_O == null) {
            break L11;
          } else {
            ((ul) this).field_z = ((ul) this).field_z + (var7.b(((ul) this).field_O, ((ul) this).field_u + -40, var7.field_H) + 5);
            break L11;
          }
        }
        L12: {
          var8 = se.field_e;
          var9 = hd.a(true, rl.a((byte) -107));
          if (ml.field_F != var9) {
            if (wd.field_b != var9) {
              break L12;
            } else {
              var8 = l.field_a;
              break L12;
            }
          } else {
            var8 = ck.field_q;
            break L12;
          }
        }
        L13: {
          var12 = new ml(10, ((ul) this).field_z, ((ul) this).field_u + -20, 25, (qa) (Object) ((ul) this).field_H, false, 80, 3, var7, 16777215, var8);
          ((ul) this).a((qa) (Object) new ml(10, ((ul) this).field_z, ((ul) this).field_u + -20, 25, (qa) (Object) ((ul) this).field_H, false, 80, 3, var7, 16777215, var8), (byte) -61);
          ((ul) this).field_z = ((ul) this).field_z + (5 + ((qa) (Object) var12).field_j);
          var13 = new ml(10, ((ul) this).field_z, ((ul) this).field_u - 20, 25, (qa) (Object) ((ul) this).field_J, false, 80, 3, var7, 16777215, kc.field_g);
          ((ul) this).a((qa) (Object) new ml(10, ((ul) this).field_z, ((ul) this).field_u - 20, 25, (qa) (Object) ((ul) this).field_J, false, 80, 3, var7, 16777215, kc.field_g), (byte) -118);
          ((ul) this).field_I.field_s = (kd) this;
          ((ul) this).field_z = ((ul) this).field_z + (((qa) (Object) var13).field_j - -5);
          if (null == ((ul) this).field_N) {
            break L13;
          } else {
            ((ul) this).field_N.field_s = (kd) this;
            break L13;
          }
        }
        L14: {
          if (null == ((ul) this).field_L) {
            break L14;
          } else {
            ((ul) this).field_L.field_s = (kd) this;
            break L14;
          }
        }
        L15: {
          if (null == ((ul) this).field_N) {
            ((ul) this).field_I.a(8, -6 + ((ul) this).field_u + -10, ((ul) this).field_z, 30, 80);
            ((ul) this).field_z = ((ul) this).field_z + 35;
            break L15;
          } else {
            ((ul) this).field_I.a(85, -95 + ((ul) this).field_u, ((ul) this).field_z, 30, 80);
            ((ul) this).field_z = ((ul) this).field_z + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((ul) this).field_N) {
            break L16;
          } else {
            ((ul) this).field_N.a(8, -6 + ((ul) this).field_u - 10, ((ul) this).field_z, 30, 80);
            ((ul) this).field_z = ((ul) this).field_z + 35;
            break L16;
          }
        }
        L17: {
          if (((ul) this).field_L == null) {
            break L17;
          } else {
            L18: {
              if (((ul) this).field_P) {
                break L18;
              } else {
                if (((ul) this).field_K) {
                  break L18;
                } else {
                  ((ul) this).field_L.a(8, 40, ((ul) this).field_z, 20, 80);
                  ((ul) this).field_z = ((ul) this).field_z + 25;
                  break L17;
                }
              }
            }
            ((ul) this).field_L.a(8, -6 + ((ul) this).field_u + -10, ((ul) this).field_z, 30, 80);
            ((ul) this).field_z = ((ul) this).field_z + 35;
            break L17;
          }
        }
        L19: {
          ((ul) this).a(0, ((ul) this).field_u, 0, ((ul) this).field_z + 3, 80);
          ((ul) this).a((qa) (Object) ((ul) this).field_I, (byte) -76);
          if (null == ((ul) this).field_N) {
            break L19;
          } else {
            ((ul) this).a((qa) (Object) ((ul) this).field_N, (byte) -42);
            break L19;
          }
        }
        L20: {
          if (null == ((ul) this).field_L) {
            break L20;
          } else {
            ((ul) this).a((qa) (Object) ((ul) this).field_L, (byte) -33);
            break L20;
          }
        }
    }

    static {
    }
}
