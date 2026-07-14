/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cv extends sp implements pw, ai {
    static tg field_F;
    private wp field_A;
    static int[] field_G;
    private dh field_H;
    private boolean field_J;
    private dh field_I;
    private String field_K;
    private wp field_N;
    static int field_E;
    private wp field_D;
    private boolean field_M;
    static int field_O;
    private boolean field_B;

    public final void a(dh param0, int param1) {
        if (((cv) this).field_H == param0) {
            boolean discarded$0 = ((cv) this).field_I.a((pk) this, (byte) 61);
        }
        if (param0 == ((cv) this).field_I) {
            this.e((byte) -23);
        }
        if (param1 >= -41) {
            ((cv) this).a(51, -15, (byte) 12, 126);
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 710) {
            break L0;
          } else {
            ((cv) this).field_H = null;
            break L0;
          }
        }
        L1: {
          if (param2 == ((cv) this).field_A) {
            this.e((byte) -23);
            break L1;
          } else {
            if (((cv) this).field_D == param2) {
              rv.a((byte) 58);
              break L1;
            } else {
              if (((cv) this).field_N == param2) {
                if (((cv) this).field_B) {
                  nt.c(param1 ^ 710);
                  break L1;
                } else {
                  if (((cv) this).field_J) {
                    nb.a(true);
                    break L1;
                  } else {
                    pi.a((byte) -110);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != ((cv) this).field_K) {
            int discarded$0 = kw.field_b.a(((cv) this).field_K, 20 + (((cv) this).field_r + param0), param1 - -((cv) this).field_v + 15, ((cv) this).field_q + -40, ((cv) this).field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
        }
        if (param2 >= -35) {
            ((cv) this).field_H = null;
        }
        if (!(null == ((cv) this).field_D)) {
            lk.f(param0 - -10, param1 + 134, -20 + ((cv) this).field_q, 4210752);
        }
        super.a(param0, param1, (byte) -59, param3);
    }

    cv(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (mh) null);
        ue var6 = null;
        vn var7 = null;
        String var8 = null;
        jj var9 = null;
        rt var12 = null;
        rt var13 = null;
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
        wp stackIn_16_1 = null;
        wp stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        wp stackIn_17_1 = null;
        wp stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        wp stackIn_18_1 = null;
        wp stackIn_18_2 = null;
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
        wp stackOut_15_1 = null;
        wp stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        wp stackOut_17_1 = null;
        wp stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        wp stackOut_16_1 = null;
        wp stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
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
          ((cv) this).field_B = stackIn_3_1 != 0;
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
          ((cv) this).field_M = stackIn_6_1 != 0;
          ((cv) this).field_K = param1;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param4) {
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
          ((cv) this).field_J = stackIn_9_1 != 0;
          if (!((cv) this).field_B) {
            break L3;
          } else {
            L4: {
              if (((cv) this).field_M) {
                break L4;
              } else {
                if (!((cv) this).field_J) {
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
          ((cv) this).field_H = (dh) (Object) new qq(param0, (qm) this, 100);
          ((cv) this).field_I = (dh) (Object) new qq("", (qm) this, 20);
          if (!((cv) this).field_B) {
            L6: {
              ((cv) this).field_A = new wp(ma.field_c, (qm) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((cv) this).field_J) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = tm.field_b;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = cq.field_c;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new wp(stackIn_18_3, (qm) null);
            ((cv) this).field_N = stackIn_18_1;
            if (!((cv) this).field_M) {
              break L5;
            } else {
              ((cv) this).field_D = new wp(ms.field_i, (qm) this);
              break L5;
            }
          } else {
            ((cv) this).field_A = new wp(ii.field_b, (qm) null);
            ((cv) this).field_N = new wp(of.field_k, (qm) null);
            ((cv) this).field_H.field_x = false;
            break L5;
          }
        }
        L7: {
          ((cv) this).field_H.field_w = (mh) (Object) new nl(10000536);
          ((cv) this).field_I.field_w = (mh) (Object) new c(10000536);
          var6 = new ue();
          ((cv) this).field_A.field_w = (mh) (Object) var6;
          if (((cv) this).field_N == null) {
            break L7;
          } else {
            ((cv) this).field_N.field_w = (mh) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((cv) this).field_H.field_t = cn.field_hb;
          if (null == ((cv) this).field_D) {
            break L8;
          } else {
            ((cv) this).field_D.field_w = (mh) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((cv) this).field_D) {
            break L9;
          } else {
            ((cv) this).field_D.field_t = aj.field_x;
            break L9;
          }
        }
        L10: {
          if (((cv) this).field_B) {
            ((cv) this).field_N.field_t = rv.field_a;
            break L10;
          } else {
            if (!((cv) this).field_J) {
              ((cv) this).field_N.field_w = (mh) (Object) new bv();
              break L10;
            } else {
              ((cv) this).field_N.field_t = hg.field_t;
              ((cv) this).field_N.field_w = (mh) (Object) new bv();
              break L10;
            }
          }
        }
        L11: {
          ((cv) this).field_v = 15;
          var7 = kw.field_b;
          if (((cv) this).field_K == null) {
            break L11;
          } else {
            ((cv) this).field_v = ((cv) this).field_v + (var7.a(((cv) this).field_K, -40 + ((cv) this).field_q, var7.field_s) - -5);
            break L11;
          }
        }
        L12: {
          var8 = ej.field_g;
          var9 = lv.a(ra.c(2), 1);
          if (go.field_m != var9) {
            if (tr.field_j != var9) {
              break L12;
            } else {
              var8 = ph.field_h;
              break L12;
            }
          } else {
            var8 = ow.field_b;
            break L12;
          }
        }
        L13: {
          var12 = new rt(10, ((cv) this).field_v, ((cv) this).field_q - 20, 25, (pk) (Object) ((cv) this).field_H, false, 80, 3, var7, 16777215, var8);
          ((cv) this).a((pk) (Object) new rt(10, ((cv) this).field_v, ((cv) this).field_q - 20, 25, (pk) (Object) ((cv) this).field_H, false, 80, 3, var7, 16777215, var8), 80);
          ((cv) this).field_v = ((cv) this).field_v + (((pk) (Object) var12).field_p - -5);
          var13 = new rt(10, ((cv) this).field_v, -20 + ((cv) this).field_q, 25, (pk) (Object) ((cv) this).field_I, false, 80, 3, var7, 16777215, pi.field_g);
          ((cv) this).a((pk) (Object) new rt(10, ((cv) this).field_v, -20 + ((cv) this).field_q, 25, (pk) (Object) ((cv) this).field_I, false, 80, 3, var7, 16777215, pi.field_g), 107);
          ((cv) this).field_v = ((cv) this).field_v + (((pk) (Object) var13).field_p + 5);
          ((cv) this).field_A.field_o = (qm) this;
          if (((cv) this).field_D == null) {
            break L13;
          } else {
            ((cv) this).field_D.field_o = (qm) this;
            break L13;
          }
        }
        L14: {
          if (((cv) this).field_N == null) {
            break L14;
          } else {
            ((cv) this).field_N.field_o = (qm) this;
            break L14;
          }
        }
        L15: {
          if (null != ((cv) this).field_D) {
            ((cv) this).field_A.a(-123, 85, ((cv) this).field_v, 30, ((cv) this).field_q + -95);
            ((cv) this).field_v = ((cv) this).field_v + 60;
            break L15;
          } else {
            ((cv) this).field_A.a(120, 8, ((cv) this).field_v, 30, -16 + ((cv) this).field_q);
            ((cv) this).field_v = ((cv) this).field_v + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((cv) this).field_D) {
            break L16;
          } else {
            ((cv) this).field_D.a(111, 8, ((cv) this).field_v, 30, -6 + (((cv) this).field_q + -10));
            ((cv) this).field_v = ((cv) this).field_v + 35;
            break L16;
          }
        }
        L17: {
          if (((cv) this).field_N == null) {
            break L17;
          } else {
            L18: {
              if (((cv) this).field_B) {
                break L18;
              } else {
                if (((cv) this).field_J) {
                  break L18;
                } else {
                  ((cv) this).field_N.a(-110, 8, ((cv) this).field_v, 20, 40);
                  ((cv) this).field_v = ((cv) this).field_v + 25;
                  break L17;
                }
              }
            }
            ((cv) this).field_N.a(126, 8, ((cv) this).field_v, 30, ((cv) this).field_q + -16);
            ((cv) this).field_v = ((cv) this).field_v + 35;
            break L17;
          }
        }
        L19: {
          ((cv) this).a(-48, 0, 0, ((cv) this).field_v + 3, ((cv) this).field_q);
          ((cv) this).a((pk) (Object) ((cv) this).field_A, 84);
          if (null == ((cv) this).field_D) {
            break L19;
          } else {
            ((cv) this).a((pk) (Object) ((cv) this).field_D, 127);
            break L19;
          }
        }
        L20: {
          if (null == ((cv) this).field_N) {
            break L20;
          } else {
            ((cv) this).a((pk) (Object) ((cv) this).field_N, 117);
            break L20;
          }
        }
    }

    public static void g(int param0) {
        field_G = null;
        if (param0 >= -116) {
            return;
        }
        field_F = null;
    }

    final static int e(boolean param0) {
        if (param0) {
            field_O = -86;
        }
        return cb.field_c;
    }

    final void h(int param0) {
        ((cv) this).field_H.i(-1);
        ((cv) this).field_I.i(-1);
        if (param0 >= -76) {
            ((cv) this).field_H = null;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if (param2 >= 9) {
          if (!super.a(param0, param1, (byte) 63, param3)) {
            if (98 == param3) {
              return ((cv) this).a((byte) -104, param0);
            } else {
              if (param3 == 99) {
                return ((cv) this).a(param0, false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private final void e(byte param0) {
        if (!oi.a((byte) -64)) {
            // ifle L63
            // if_icmpge L63
        }
        m.a(((cv) this).field_I.field_m, ((cv) this).field_H.field_m, -1807);
        if (param0 != -23) {
            ((cv) this).field_D = null;
        }
    }

    public final void a(dh param0, byte param1) {
        if (param1 > -127) {
            ((cv) this).field_A = null;
        }
    }

    final void a(int param0, String param1) {
        if (param0 != -3499) {
            Object var5 = null;
            ((cv) this).a((dh) null, 89);
        }
        dh var3 = ((cv) this).field_H;
        String var4 = param1;
        var3.a(false, var4, (byte) 67);
        ((cv) this).field_I.i(param0 + 3498);
    }

    final String a(byte param0) {
        if (((cv) this).field_H.field_m == null) {
            return "";
        }
        int var2 = -85 % ((-35 - param0) / 59);
        return ((cv) this).field_H.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[128];
        field_F = new tg();
        field_O = 480;
    }
}
