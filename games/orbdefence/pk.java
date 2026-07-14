/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pk extends ta implements jb, ai {
    private String field_L;
    static int field_H;
    static int[] field_F;
    private vi field_N;
    static String[] field_B;
    private boolean field_M;
    private s field_A;
    static String field_G;
    private boolean field_J;
    private vi field_C;
    private boolean field_D;
    private s field_K;
    private s field_I;

    final String a(byte param0) {
        if (!(((pk) this).field_N.field_l != null)) {
            return "";
        }
        if (param0 < 77) {
            return null;
        }
        return ((pk) this).field_N.field_l;
    }

    public static void l(int param0) {
        field_B = null;
        field_G = null;
        field_F = null;
        if (param0 != -100) {
            Object var2 = null;
            boolean discarded$0 = pk.a(2, 65, (ki) null, 120);
        }
    }

    public final void a(vi param0, boolean param1) {
        if (((pk) this).field_N == param0) {
            boolean discarded$0 = ((pk) this).field_C.a(-81, (pj) this);
        }
        if (((pk) this).field_C == param0) {
            this.k(99);
        }
        if (param1) {
            ((pk) this).a(-16, 78, -13, 121);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((pk) this).field_L) {
            int discarded$0 = lm.field_f.a(((pk) this).field_L, 20 + ((pk) this).field_s + param3, ((pk) this).field_n + (param0 + 15), ((pk) this).field_m + -40, ((pk) this).field_r, 16777215, -1, 1, 0, lm.field_f.field_H);
        }
        if (!(((pk) this).field_K == null)) {
            ul.d(param3 - -10, param0 + 134, -20 + ((pk) this).field_m, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void m(int param0) {
        ((pk) this).field_N.e((byte) -128);
        ((pk) this).field_C.e((byte) -128);
        if (param0 > -7) {
            ((pk) this).field_I = null;
        }
    }

    final static boolean a(int param0, int param1, ki param2, int param3) {
        byte[] var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        var6 = param2.b(param1, false, param3);
        var4 = var6;
        var5 = 28 / ((param0 - 28) / 40);
        if (var6 == null) {
          return false;
        } else {
          OrbDefence.a(var6, (byte) -93);
          return true;
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (param1 != 98) {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((pk) this).b(param2, false);
            }
          } else {
            return ((pk) this).a(param2, false);
          }
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = OrbDefence.field_D ? 1 : 0;
            if (param3 == ((pk) this).field_I) {
              this.k(35);
              break L1;
            } else {
              if (((pk) this).field_K == param3) {
                d.c((byte) -66);
                break L1;
              } else {
                if (param3 == ((pk) this).field_A) {
                  if (((pk) this).field_M) {
                    pa.a(true);
                    break L1;
                  } else {
                    if (!((pk) this).field_D) {
                      dk.a((byte) 19);
                      break L1;
                    } else {
                      qd.a((byte) 127);
                      break L1;
                    }
                  }
                } else {
                  var6 = -47 % ((-3 - param0) / 62);
                  break L0;
                }
              }
            }
          }
          var6 = -47 % ((-3 - param0) / 62);
          break L0;
        }
    }

    final void a(int param0, String param1) {
        vi var3 = ((pk) this).field_N;
        String var4 = param1;
        var3.a(0, false, var4);
        if (param0 < 119) {
            ((pk) this).field_N = null;
        }
        ((pk) this).field_C.e((byte) -126);
    }

    public final void a(vi param0, int param1) {
        if (param1 <= 27) {
            ((pk) this).field_K = null;
        }
    }

    pk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (td) null);
        vk var6 = null;
        kc var7 = null;
        String var8 = null;
        df var9 = null;
        h var12 = null;
        h var13 = null;
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
        s stackIn_15_1 = null;
        s stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        s stackIn_16_1 = null;
        s stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        s stackIn_17_1 = null;
        s stackIn_17_2 = null;
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
        s stackOut_14_1 = null;
        s stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        s stackOut_16_1 = null;
        s stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        s stackOut_15_1 = null;
        s stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          ((pk) this).field_L = param1;
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
          ((pk) this).field_D = stackIn_3_1 != 0;
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
          ((pk) this).field_J = stackIn_6_1 != 0;
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
          ((pk) this).field_M = stackIn_9_1 != 0;
          if (!((pk) this).field_M) {
            break L3;
          } else {
            L4: {
              if (((pk) this).field_J) {
                break L4;
              } else {
                if (!((pk) this).field_D) {
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
          ((pk) this).field_N = (vi) (Object) new oc(param0, (ag) this, 100);
          ((pk) this).field_C = (vi) (Object) new oc("", (ag) this, 20);
          if (((pk) this).field_M) {
            ((pk) this).field_I = new s(tk.field_l, (ag) null);
            ((pk) this).field_A = new s(ld.field_d, (ag) null);
            ((pk) this).field_N.field_F = false;
            break L5;
          } else {
            L6: {
              ((pk) this).field_I = new s(q.field_a, (ag) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (((pk) this).field_D) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = gl.field_k;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = vc.field_i;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new s(stackIn_17_3, (ag) null);
            ((pk) this).field_A = stackIn_17_1;
            if (!((pk) this).field_J) {
              break L5;
            } else {
              ((pk) this).field_K = new s(ki.field_h, (ag) this);
              break L5;
            }
          }
        }
        L7: {
          ((pk) this).field_N.field_j = (td) (Object) new fg(10000536);
          ((pk) this).field_C.field_j = (td) (Object) new eg(10000536);
          var6 = new vk();
          ((pk) this).field_I.field_j = (td) (Object) var6;
          if (((pk) this).field_A == null) {
            break L7;
          } else {
            ((pk) this).field_A.field_j = (td) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((pk) this).field_N.field_i = rl.field_b;
          if (((pk) this).field_K == null) {
            break L8;
          } else {
            ((pk) this).field_K.field_j = (td) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (((pk) this).field_K == null) {
            break L9;
          } else {
            ((pk) this).field_K.field_i = ec.field_J;
            break L9;
          }
        }
        L10: {
          if (!((pk) this).field_M) {
            if (((pk) this).field_D) {
              ((pk) this).field_A.field_i = og.field_j;
              ((pk) this).field_A.field_j = (td) (Object) new qc();
              break L10;
            } else {
              ((pk) this).field_A.field_j = (td) (Object) new qc();
              break L10;
            }
          } else {
            ((pk) this).field_A.field_i = ql.field_d;
            break L10;
          }
        }
        L11: {
          ((pk) this).field_n = 15;
          var7 = lm.field_f;
          if (null == ((pk) this).field_L) {
            break L11;
          } else {
            ((pk) this).field_n = ((pk) this).field_n + (var7.a(((pk) this).field_L, -40 + ((pk) this).field_m, var7.field_H) + 5);
            break L11;
          }
        }
        L12: {
          var8 = le.field_d;
          var9 = oa.a(true, uj.b((byte) -120));
          if (mj.field_l == var9) {
            var8 = gl.field_h;
            break L12;
          } else {
            if (var9 != vh.field_s) {
              break L12;
            } else {
              var8 = wd.field_k;
              break L12;
            }
          }
        }
        L13: {
          var12 = new h(10, ((pk) this).field_n, -20 + ((pk) this).field_m, 25, (pj) (Object) ((pk) this).field_N, false, 80, 3, var7, 16777215, var8);
          ((pk) this).a((pj) (Object) new h(10, ((pk) this).field_n, -20 + ((pk) this).field_m, 25, (pj) (Object) ((pk) this).field_N, false, 80, 3, var7, 16777215, var8), (byte) 74);
          ((pk) this).field_n = ((pk) this).field_n + (((pj) (Object) var12).field_r + 5);
          var13 = new h(10, ((pk) this).field_n, ((pk) this).field_m + -20, 25, (pj) (Object) ((pk) this).field_C, false, 80, 3, var7, 16777215, hi.field_h);
          ((pk) this).a((pj) (Object) new h(10, ((pk) this).field_n, ((pk) this).field_m + -20, 25, (pj) (Object) ((pk) this).field_C, false, 80, 3, var7, 16777215, hi.field_h), (byte) 74);
          ((pk) this).field_n = ((pk) this).field_n + (((pj) (Object) var13).field_r - -5);
          ((pk) this).field_I.field_h = (ag) this;
          if (((pk) this).field_K == null) {
            break L13;
          } else {
            ((pk) this).field_K.field_h = (ag) this;
            break L13;
          }
        }
        L14: {
          if (null == ((pk) this).field_A) {
            break L14;
          } else {
            ((pk) this).field_A.field_h = (ag) this;
            break L14;
          }
        }
        L15: {
          if (((pk) this).field_K != null) {
            ((pk) this).field_I.a(85, ((pk) this).field_n, 30, (byte) -90, -95 + ((pk) this).field_m);
            ((pk) this).field_n = ((pk) this).field_n + 60;
            break L15;
          } else {
            ((pk) this).field_I.a(8, ((pk) this).field_n, 30, (byte) -90, -6 + ((pk) this).field_m - 10);
            ((pk) this).field_n = ((pk) this).field_n + 35;
            break L15;
          }
        }
        L16: {
          if (((pk) this).field_K == null) {
            break L16;
          } else {
            ((pk) this).field_K.a(8, ((pk) this).field_n, 30, (byte) -90, ((pk) this).field_m - 6 + -10);
            ((pk) this).field_n = ((pk) this).field_n + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((pk) this).field_A) {
            break L17;
          } else {
            L18: {
              if (((pk) this).field_M) {
                break L18;
              } else {
                if (((pk) this).field_D) {
                  break L18;
                } else {
                  ((pk) this).field_A.a(8, ((pk) this).field_n, 20, (byte) -90, 40);
                  ((pk) this).field_n = ((pk) this).field_n + 25;
                  break L17;
                }
              }
            }
            ((pk) this).field_A.a(8, ((pk) this).field_n, 30, (byte) -90, -6 + (((pk) this).field_m - 10));
            ((pk) this).field_n = ((pk) this).field_n + 35;
            break L17;
          }
        }
        L19: {
          ((pk) this).a(0, 0, 3 + ((pk) this).field_n, (byte) -90, ((pk) this).field_m);
          ((pk) this).a((pj) (Object) ((pk) this).field_I, (byte) 74);
          if (null == ((pk) this).field_K) {
            break L19;
          } else {
            ((pk) this).a((pj) (Object) ((pk) this).field_K, (byte) 74);
            break L19;
          }
        }
        L20: {
          if (null == ((pk) this).field_A) {
            break L20;
          } else {
            ((pk) this).a((pj) (Object) ((pk) this).field_A, (byte) 74);
            break L20;
          }
        }
    }

    private final void k(int param0) {
        if (!qe.b(14388)) {
            // if_icmpge L63
            // if_icmplt L44
        } else {
            vf.a((byte) 108, ((pk) this).field_C.field_l, ((pk) this).field_N.field_l);
        }
        if (param0 < 27) {
            Object var3 = null;
            boolean discarded$0 = ((pk) this).a('￷', 82, (pj) null, -124);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[4];
        field_H = 0;
        field_B = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_G = "Email address is unavailable";
    }
}
