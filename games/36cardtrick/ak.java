/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends g implements pi, qh {
    private hf field_J;
    private boolean field_G;
    private hl field_I;
    private boolean field_D;
    static String field_L;
    private String field_F;
    static long[] field_P;
    static String[] field_N;
    private hf field_K;
    private hl field_M;
    private boolean field_E;
    static int field_O;
    private hl field_H;

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (param1 <= -99) {
          if (!this.a(param0, (byte) -105, param2, param3)) {
            if (param2 != 98) {
              if (param2 != 99) {
                return false;
              } else {
                return ((ak) this).a(param3, (byte) -28);
              }
            } else {
              return ((ak) this).b(106, param3);
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void l(int param0) {
        ((ak) this).field_J.n(param0 + 31843);
        ((ak) this).field_K.n(-124);
        if (param0 != -31940) {
            this.e((byte) 23);
        }
    }

    public final void a(hf param0, int param1) {
        if (param1 != 12891) {
            hf var4 = (hf) null;
            ((ak) this).a(-102, (hf) null);
        }
    }

    ak(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ci) null);
        ki var6 = null;
        ee var7 = null;
        String var8 = null;
        qa var9 = null;
        ck var12 = null;
        ck var13 = null;
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
        hl stackIn_16_1 = null;
        hl stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hl stackIn_17_1 = null;
        hl stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hl stackIn_18_1 = null;
        hl stackIn_18_2 = null;
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
        hl stackOut_15_1 = null;
        hl stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        hl stackOut_17_1 = null;
        hl stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        hl stackOut_16_1 = null;
        hl stackOut_16_2 = null;
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
          ((ak) this).field_G = stackIn_3_1 != 0;
          ((ak) this).field_F = param1;
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
          ((ak) this).field_E = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param3) {
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
          ((ak) this).field_D = stackIn_9_1 != 0;
          if (!((ak) this).field_G) {
            break L3;
          } else {
            L4: {
              if (((ak) this).field_D) {
                break L4;
              } else {
                if (!((ak) this).field_E) {
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
          ((ak) this).field_J = (hf) (Object) new v(param0, (pl) this, 100);
          ((ak) this).field_K = (hf) (Object) new v("", (pl) this, 20);
          if (!((ak) this).field_G) {
            L6: {
              ((ak) this).field_I = new hl(q.field_f, (pl) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((ak) this).field_E) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = uc.field_r;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = oa.field_b;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new hl((String) (Object) stackIn_18_3, (pl) null);
            ((ak) this).field_H = (hl) (Object) stackIn_18_1;
            if (!((ak) this).field_D) {
              break L5;
            } else {
              ((ak) this).field_M = new hl(mg.field_K, (pl) this);
              break L5;
            }
          } else {
            ((ak) this).field_I = new hl(tc.field_c, (pl) null);
            ((ak) this).field_H = new hl(pg.field_f, (pl) null);
            ((ak) this).field_J.field_B = false;
            break L5;
          }
        }
        L7: {
          ((ak) this).field_J.field_v = (ci) (Object) new r(10000536);
          ((ak) this).field_K.field_v = (ci) (Object) new rl(10000536);
          var6 = new ki();
          ((ak) this).field_I.field_v = (ci) (Object) var6;
          if (null == ((ak) this).field_H) {
            break L7;
          } else {
            ((ak) this).field_H.field_v = (ci) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((ak) this).field_J.field_n = sl.field_c;
          if (((ak) this).field_M == null) {
            break L8;
          } else {
            ((ak) this).field_M.field_v = (ci) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((ak) this).field_M) {
            break L9;
          } else {
            ((ak) this).field_M.field_n = bl.field_b;
            break L9;
          }
        }
        L10: {
          if (!((ak) this).field_G) {
            if (((ak) this).field_E) {
              ((ak) this).field_H.field_n = w.field_m;
              ((ak) this).field_H.field_v = (ci) (Object) new nb();
              break L10;
            } else {
              ((ak) this).field_H.field_v = (ci) (Object) new nb();
              break L10;
            }
          } else {
            ((ak) this).field_H.field_n = vg.field_c;
            break L10;
          }
        }
        L11: {
          ((ak) this).field_i = 15;
          var7 = j.field_C;
          if (((ak) this).field_F == null) {
            break L11;
          } else {
            ((ak) this).field_i = ((ak) this).field_i + (5 + var7.b(((ak) this).field_F, ((ak) this).field_h - 40, ((ee) var7).field_s));
            break L11;
          }
        }
        L12: {
          var8 = ck.field_F;
          var9 = ma.a(mk.g(-122), -3825);
          if (ke.field_c == var9) {
            var8 = ja.field_d;
            break L12;
          } else {
            if (oj.field_e != var9) {
              break L12;
            } else {
              var8 = ab.field_q;
              break L12;
            }
          }
        }
        L13: {
          var12 = new ck(10, ((ak) this).field_i, ((ak) this).field_h + -20, 25, (lk) (Object) ((ak) this).field_J, false, 80, 3, var7, 16777215, var8);
          ((ak) this).b((lk) (Object) new ck(10, ((ak) this).field_i, ((ak) this).field_h + -20, 25, (lk) (Object) ((ak) this).field_J, false, 80, 3, var7, 16777215, var8), (byte) 118);
          ((ak) this).field_i = ((ak) this).field_i + (5 + ((lk) var12).field_q);
          var13 = new ck(10, ((ak) this).field_i, ((ak) this).field_h + -20, 25, (lk) (Object) ((ak) this).field_K, false, 80, 3, var7, 16777215, fl.field_b);
          ((ak) this).b((lk) (Object) new ck(10, ((ak) this).field_i, ((ak) this).field_h + -20, 25, (lk) (Object) ((ak) this).field_K, false, 80, 3, var7, 16777215, fl.field_b), (byte) 118);
          ((ak) this).field_i = ((ak) this).field_i + (((lk) var13).field_q - -5);
          ((ak) this).field_I.field_k = (pl) this;
          if (null == ((ak) this).field_M) {
            break L13;
          } else {
            ((ak) this).field_M.field_k = (pl) this;
            break L13;
          }
        }
        L14: {
          if (((ak) this).field_H == null) {
            break L14;
          } else {
            ((ak) this).field_H.field_k = (pl) this;
            break L14;
          }
        }
        L15: {
          if (null == ((ak) this).field_M) {
            ((ak) this).field_I.a(30, ((ak) this).field_i, -10 + ((ak) this).field_h - 6, 8, true);
            ((ak) this).field_i = ((ak) this).field_i + 35;
            break L15;
          } else {
            ((ak) this).field_I.a(30, ((ak) this).field_i, -95 + ((ak) this).field_h, 85, true);
            ((ak) this).field_i = ((ak) this).field_i + 60;
            break L15;
          }
        }
        L16: {
          if (((ak) this).field_M == null) {
            break L16;
          } else {
            ((ak) this).field_M.a(30, ((ak) this).field_i, -16 + ((ak) this).field_h, 8, true);
            ((ak) this).field_i = ((ak) this).field_i + 35;
            break L16;
          }
        }
        L17: {
          if (((ak) this).field_H == null) {
            break L17;
          } else {
            L18: {
              if (((ak) this).field_G) {
                break L18;
              } else {
                if (!((ak) this).field_E) {
                  ((ak) this).field_H.a(20, ((ak) this).field_i, 40, 8, true);
                  ((ak) this).field_i = ((ak) this).field_i + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((ak) this).field_H.a(30, ((ak) this).field_i, -10 + (((ak) this).field_h + -6), 8, true);
            ((ak) this).field_i = ((ak) this).field_i + 35;
            break L17;
          }
        }
        L19: {
          ((ak) this).a(((ak) this).field_i + 3, 0, ((ak) this).field_h, 0, true);
          ((ak) this).b((lk) (Object) ((ak) this).field_I, (byte) 118);
          if (null == ((ak) this).field_M) {
            break L19;
          } else {
            ((ak) this).b((lk) (Object) ((ak) this).field_M, (byte) 118);
            break L19;
          }
        }
        L20: {
          if (null == ((ak) this).field_H) {
            break L20;
          } else {
            ((ak) this).b((lk) (Object) ((ak) this).field_H, (byte) 118);
            break L20;
          }
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Main.field_T;
          if (param3 != ((ak) this).field_I) {
            if (param3 == ((ak) this).field_M) {
              jk.a(false);
              break L0;
            } else {
              if (param3 != ((ak) this).field_H) {
                break L0;
              } else {
                if (((ak) this).field_G) {
                  j.i(92);
                  break L0;
                } else {
                  if (((ak) this).field_E) {
                    a.d((byte) 74);
                    break L0;
                  } else {
                    td.a((byte) -11);
                    break L0;
                  }
                }
              }
            }
          } else {
            this.e((byte) 121);
            break L0;
          }
        }
        var6 = 100 / ((param1 - -62) / 32);
    }

    final String d(byte param0) {
        int var2 = 2 % ((param0 - -1) / 36);
        if (!(null != ((ak) this).field_J.field_r)) {
            return "";
        }
        return ((ak) this).field_J.field_r;
    }

    public final void a(int param0, hf param1) {
        if (!(param1 != ((ak) this).field_J)) {
            boolean discarded$0 = ((ak) this).field_K.a(param0 + 82, (lk) this);
        }
        if (!(((ak) this).field_K != param1)) {
            this.e((byte) 121);
        }
        if (param0 != -1) {
            field_O = -19;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != -1) {
          return;
        } else {
          L0: {
            if (null != ((ak) this).field_F) {
              int discarded$1 = j.field_C.a(((ak) this).field_F, 20 + (((ak) this).field_o + param0), ((ak) this).field_i + param1 + 15, ((ak) this).field_h + -40, ((ak) this).field_q, 16777215, -1, 1, 0, j.field_C.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((ak) this).field_M == null) {
              break L1;
            } else {
              vj.d(10 + param0, param1 + 134, ((ak) this).field_h + -20, 4210752);
              break L1;
            }
          }
          this.a(param0, param1, param2 ^ 0, param3);
          return;
        }
    }

    public static void a(boolean param0) {
        field_P = null;
        field_N = null;
        if (param0) {
            ak.a(false);
        }
        field_L = null;
    }

    final void a(String param0, int param1) {
        hf var3 = ((ak) this).field_J;
        String var4 = param0;
        if (param1 != -95) {
            lk var5 = (lk) null;
            boolean discarded$0 = ((ak) this).a(',', (byte) -38, -43, (lk) null);
        }
        var3.a(var4, -18845, false);
        ((ak) this).field_K.n(101);
    }

    private final void e(byte param0) {
        if (param0 != 121) {
            ((ak) this).field_E = false;
        }
        if (!cc.a(77)) {
            // if_icmple L74
            // if_icmplt L53
        } else {
            tl.a(((ak) this).field_J.field_r, ((ak) this).field_K.field_r, param0 ^ 9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Waiting for fonts";
        field_N = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_P = new long[32];
    }
}
