/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends vd implements fca, lja {
    private hf field_K;
    private hf field_M;
    private boolean field_I;
    private lka field_Q;
    private String field_L;
    static int field_E;
    private boolean field_J;
    private lka field_H;
    private hf field_O;
    static int field_G;
    static int field_D;
    private boolean field_F;
    static String field_N;
    static long field_P;
    static kv field_C;

    public final void a(lka param0, byte param1) {
        int var3 = 85 % ((0 - param1) / 49);
    }

    private final void k(int param0) {
        if (!ch.b(68)) {
            // if_icmpge L59
            // ifgt L40
        } else {
            g.a(((ph) this).field_H.field_w, ((ph) this).field_Q.field_w, (byte) 81);
        }
        if (param0 > -2) {
            this.k(78);
        }
    }

    final void b(boolean param0) {
        ((ph) this).field_Q.j((byte) -108);
        ((ph) this).field_H.j((byte) -69);
        if (param0) {
            field_E = -85;
        }
    }

    public final void a(lka param0, int param1) {
        if (param0 == ((ph) this).field_Q) {
            boolean discarded$0 = ((ph) this).field_H.a((wj) this, -83);
        }
        if (!(((ph) this).field_H != param0)) {
            this.k(-118);
        }
        if (param1 != 0) {
            field_P = -122L;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = -90 % ((param0 - -20) / 54);
        if (((ph) this).field_L != null) {
            int discarded$0 = jca.field_a.a(((ph) this).field_L, ((ph) this).field_s + param3 - -20, 15 + (param1 - -((ph) this).field_v), ((ph) this).field_p + -40, ((ph) this).field_q, 16777215, -1, 1, 0, jca.field_a.field_u);
        }
        if (null != ((ph) this).field_O) {
            dg.e(param3 + 10, param1 + 134, ((ph) this).field_p + -20, 4210752);
        }
        this.a((byte) -102, param1, param2, param3);
    }

    final String a(int param0) {
        if (!(null != ((ph) this).field_Q.field_w)) {
            return "";
        }
        if (param0 != 1) {
            Object var3 = null;
            ((ph) this).a((lka) null, (byte) 127);
        }
        return ((ph) this).field_Q.field_w;
    }

    public static void j(int param0) {
        field_C = null;
        if (param0 != 31826) {
            field_C = null;
        }
        field_N = null;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var7 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (((ph) this).field_M != param1) {
            if (param1 == ((ph) this).field_O) {
              qfa.f(-27);
              break L0;
            } else {
              if (param1 != ((ph) this).field_K) {
                break L0;
              } else {
                if (!((ph) this).field_J) {
                  if (!((ph) this).field_F) {
                    f.a((byte) 101);
                    break L0;
                  } else {
                    jja.d((byte) 70);
                    break L0;
                  }
                } else {
                  ola.b((byte) -67);
                  break L0;
                }
              }
            }
          } else {
            this.k(-94);
            break L0;
          }
        }
        L1: {
          if (param3 >= 50) {
            break L1;
          } else {
            ph.j(13);
            break L1;
          }
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        if (this.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param1 != 98) {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((ph) this).b(param3, 1);
            }
          } else {
            return ((ph) this).a(-126, param3);
          }
        }
    }

    ph(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (qda) null);
        ff var6 = null;
        po var7 = null;
        String var8 = null;
        hk var9 = null;
        ge var12 = null;
        ge var13 = null;
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
        hf stackIn_15_1 = null;
        hf stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        hf stackIn_16_1 = null;
        hf stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hf stackIn_17_1 = null;
        hf stackIn_17_2 = null;
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
        hf stackOut_14_1 = null;
        hf stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        hf stackOut_16_1 = null;
        hf stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        hf stackOut_15_1 = null;
        hf stackOut_15_2 = null;
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
          ((ph) this).field_I = stackIn_3_1 != 0;
          ((ph) this).field_L = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
          ((ph) this).field_J = stackIn_6_1 != 0;
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
          ((ph) this).field_F = stackIn_9_1 != 0;
          if (!((ph) this).field_J) {
            break L3;
          } else {
            L4: {
              if (((ph) this).field_I) {
                break L4;
              } else {
                if (!((ph) this).field_F) {
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
          ((ph) this).field_Q = (lka) (Object) new vn(param0, (pl) this, 100);
          ((ph) this).field_H = (lka) (Object) new vn("", (pl) this, 20);
          if (((ph) this).field_J) {
            ((ph) this).field_M = new hf(bga.field_k, (pl) null);
            ((ph) this).field_K = new hf(uda.field_ab, (pl) null);
            ((ph) this).field_Q.field_z = false;
            break L5;
          } else {
            L6: {
              ((ph) this).field_M = new hf(tq.field_n, (pl) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (((ph) this).field_F) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = tja.field_b;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = ina.field_s;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new hf((String) (Object) stackIn_17_3, (pl) null);
            ((ph) this).field_K = (hf) (Object) stackIn_17_1;
            if (!((ph) this).field_I) {
              break L5;
            } else {
              ((ph) this).field_O = new hf(sca.field_b, (pl) this);
              break L5;
            }
          }
        }
        L7: {
          ((ph) this).field_Q.field_f = (qda) (Object) new oka(10000536);
          ((ph) this).field_H.field_f = (qda) (Object) new cm(10000536);
          var6 = new ff();
          ((ph) this).field_M.field_f = (qda) (Object) var6;
          if (((ph) this).field_K == null) {
            break L7;
          } else {
            ((ph) this).field_K.field_f = (qda) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ph) this).field_Q.field_h = ba.field_r;
          if (null == ((ph) this).field_O) {
            break L8;
          } else {
            ((ph) this).field_O.field_f = (qda) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((ph) this).field_O) {
            break L9;
          } else {
            ((ph) this).field_O.field_h = qha.field_h;
            break L9;
          }
        }
        L10: {
          if (!((ph) this).field_J) {
            if (((ph) this).field_F) {
              ((ph) this).field_K.field_h = lna.field_h;
              ((ph) this).field_K.field_f = (qda) (Object) new pka();
              break L10;
            } else {
              ((ph) this).field_K.field_f = (qda) (Object) new pka();
              break L10;
            }
          } else {
            ((ph) this).field_K.field_h = wha.field_e;
            break L10;
          }
        }
        L11: {
          ((ph) this).field_v = 15;
          var7 = jca.field_a;
          if (null == ((ph) this).field_L) {
            break L11;
          } else {
            ((ph) this).field_v = ((ph) this).field_v + (5 + var7.a(((ph) this).field_L, -40 + ((ph) this).field_p, var7.field_u));
            break L11;
          }
        }
        L12: {
          var8 = rw.field_b;
          var9 = hha.a((byte) 127, nia.d(-31768));
          if (se.field_u == var9) {
            var8 = kr.field_zb;
            break L12;
          } else {
            if (er.field_x != var9) {
              break L12;
            } else {
              var8 = ji.field_g;
              break L12;
            }
          }
        }
        L13: {
          var12 = new ge(10, ((ph) this).field_v, -20 + ((ph) this).field_p, 25, (wj) (Object) ((ph) this).field_Q, false, 80, 3, var7, 16777215, var8);
          ((ph) this).c((wj) (Object) new ge(10, ((ph) this).field_v, -20 + ((ph) this).field_p, 25, (wj) (Object) ((ph) this).field_Q, false, 80, 3, var7, 16777215, var8), 15);
          ((ph) this).field_v = ((ph) this).field_v + (((wj) (Object) var12).field_q + 5);
          var13 = new ge(10, ((ph) this).field_v, ((ph) this).field_p + -20, 25, (wj) (Object) ((ph) this).field_H, false, 80, 3, var7, 16777215, mp.field_r);
          ((ph) this).c((wj) (Object) new ge(10, ((ph) this).field_v, ((ph) this).field_p + -20, 25, (wj) (Object) ((ph) this).field_H, false, 80, 3, var7, 16777215, mp.field_r), -120);
          ((ph) this).field_v = ((ph) this).field_v + (5 + ((wj) (Object) var13).field_q);
          ((ph) this).field_M.field_k = (pl) this;
          if (null == ((ph) this).field_O) {
            break L13;
          } else {
            ((ph) this).field_O.field_k = (pl) this;
            break L13;
          }
        }
        L14: {
          if (null == ((ph) this).field_K) {
            break L14;
          } else {
            ((ph) this).field_K.field_k = (pl) this;
            break L14;
          }
        }
        L15: {
          if (null != ((ph) this).field_O) {
            ((ph) this).field_M.a(85, 30, (byte) 59, ((ph) this).field_p - 95, ((ph) this).field_v);
            ((ph) this).field_v = ((ph) this).field_v + 60;
            break L15;
          } else {
            ((ph) this).field_M.a(8, 30, (byte) 59, -6 + ((ph) this).field_p + -10, ((ph) this).field_v);
            ((ph) this).field_v = ((ph) this).field_v + 35;
            break L15;
          }
        }
        L16: {
          if (((ph) this).field_O == null) {
            break L16;
          } else {
            ((ph) this).field_O.a(8, 30, (byte) 59, -10 + ((ph) this).field_p - 6, ((ph) this).field_v);
            ((ph) this).field_v = ((ph) this).field_v + 35;
            break L16;
          }
        }
        L17: {
          if (((ph) this).field_K == null) {
            break L17;
          } else {
            L18: {
              if (((ph) this).field_J) {
                break L18;
              } else {
                if (!((ph) this).field_F) {
                  ((ph) this).field_K.a(8, 20, (byte) 59, 40, ((ph) this).field_v);
                  ((ph) this).field_v = ((ph) this).field_v + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((ph) this).field_K.a(8, 30, (byte) 59, -16 + ((ph) this).field_p, ((ph) this).field_v);
            ((ph) this).field_v = ((ph) this).field_v + 35;
            break L17;
          }
        }
        L19: {
          ((ph) this).a(0, 3 + ((ph) this).field_v, (byte) 59, ((ph) this).field_p, 0);
          ((ph) this).c((wj) (Object) ((ph) this).field_M, -126);
          if (null == ((ph) this).field_O) {
            break L19;
          } else {
            ((ph) this).c((wj) (Object) ((ph) this).field_O, -123);
            break L19;
          }
        }
        L20: {
          if (((ph) this).field_K == null) {
            break L20;
          } else {
            ((ph) this).c((wj) (Object) ((ph) this).field_K, -120);
            break L20;
          }
        }
    }

    final void a(int param0, String param1) {
        lka var3 = null;
        String var4 = null;
        if (param0 >= -89) {
          return;
        } else {
          var3 = ((ph) this).field_Q;
          var4 = param1;
          var3.a((byte) 123, var4, false);
          ((ph) this).field_H.j((byte) 101);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "This game option is only available to members.";
        pja.a(false, 50);
    }
}
