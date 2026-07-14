/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends bi {
    static String field_V;
    private String field_U;
    static String field_Q;
    private String field_P;
    private boolean field_T;
    private boolean field_S;
    private qe field_R;

    final void a(int param0, byte param1, int param2) {
        super.a(param0, (byte) -127, param2);
        rh.field_q.c(((sd) this).field_P, (((sd) this).field_l >> 214208577) + param2, 103 + param0, 16777215, -1);
        if (param1 > -79) {
            ((sd) this).field_T = false;
            if (null == ((sd) this).field_U) {
                return;
            }
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            int discarded$0 = rh.field_q.a(((sd) this).field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
        }
        if (null != ((sd) this).field_U) {
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            int discarded$1 = rh.field_q.a(((sd) this).field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
        }
    }

    final void r(int param0) {
        int var2 = -126 / ((param0 - 54) / 62);
        ((sd) this).field_R.field_w = false;
        ((sd) this).field_T = true;
    }

    sd(da param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((sd) this).field_U = param1;
        if (((sd) this).field_U != null) {
            var3 = rh.field_q.a(((sd) this).field_U, 260, rh.field_q.field_y);
            ((sd) this).a(300, var3 + 150, false);
        }
        ((sd) this).field_R = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
        ((sd) this).field_R.field_w = true;
        ((sd) this).field_T = false;
        ((sd) this).field_S = false;
        ((sd) this).a((qg) (Object) ((sd) this).field_R, (byte) -120);
    }

    final static void q(int param0) {
        if (param0 != 274) {
            field_V = null;
        }
    }

    final void a(boolean param0, String param1, byte param2, float param3) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          if (param0) {
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
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (((sd) this).field_S) {
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
        if (stackIn_6_0 != stackIn_6_1) {
          L2: {
            stackOut_10_0 = this;
            stackIn_12_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param0) {
              stackOut_12_0 = this;
              stackOut_12_1 = 0;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L2;
            } else {
              stackOut_11_0 = this;
              stackOut_11_1 = 1;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L2;
            }
          }
          ((sd) this).field_S = stackIn_13_1 != 0;
          if (((sd) this).field_S) {
            ((sd) this).field_R.a(true, 4210752, 8405024);
            ((sd) this).field_R.field_w = true;
            if (param2 == -27) {
              ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
              ((sd) this).field_P = param1;
              return;
            } else {
              sd.e((byte) 2);
              ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
              ((sd) this).field_P = param1;
              return;
            }
          } else {
            ((sd) this).field_R.a(true, 4210752, 2113632);
            if (((sd) this).field_T) {
              ((sd) this).field_R.field_w = false;
              if (param2 == -27) {
                ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
                ((sd) this).field_P = param1;
                return;
              } else {
                sd.e((byte) 2);
                ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
                ((sd) this).field_P = param1;
                return;
              }
            } else {
              if (param2 == -27) {
                ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
                ((sd) this).field_P = param1;
                return;
              } else {
                sd.e((byte) 2);
                ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
                ((sd) this).field_P = param1;
                return;
              }
            }
          }
        } else {
          if (param2 == -27) {
            ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
            ((sd) this).field_P = param1;
            return;
          } else {
            sd.e((byte) 2);
            ((sd) this).field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
            ((sd) this).field_P = param1;
            return;
          }
        }
    }

    final static void a(ci param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        Object var8 = null;
        hj var9 = null;
        int var10 = 0;
        hj var11 = null;
        e var12 = null;
        int[] var13 = null;
        e var14 = null;
        e var14_ref = null;
        int[] var15 = null;
        e var16 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        var9 = new hj(param0.a("", (byte) 124, "logo.fo3d"));
        var11 = var9;
        var3 = var11.d((byte) 121);
        var11.h((byte) 106);
        if (param1) {
          rg.field_L = u.a(var11, (byte) 26);
          ae.field_a = new int[var3][];
          rf.field_eb = new e[var3];
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              var11.n(0);
              var10 = 0;
              var4 = var10;
              L1: while (true) {
                if (var10 >= var3) {
                  return;
                } else {
                  var12 = rf.field_eb[var10];
                  var14 = var12;
                  var16 = var14;
                  var14 = var12;
                  var12.a(1, -22861, 6, 6, 6);
                  var12.a(22856);
                  var13 = new int[]{var12.field_t + var12.field_P >> -517201119, var12.field_u + var12.field_O >> 522960001, var12.field_k + var12.field_i >> 1678425313};
                  ae.field_a[var10] = var13;
                  var12.a(-var13[2], -var13[0], -var13[1], (byte) -127);
                  var10++;
                  continue L1;
                }
              }
            } else {
              rf.field_eb[var4] = nb.a(param1, var9);
              var4++;
              continue L0;
            }
          }
        } else {
          var8 = null;
          sd.a((ci) null, true);
          rg.field_L = u.a(var11, (byte) 26);
          ae.field_a = new int[var3][];
          rf.field_eb = new e[var3];
          var4 = 0;
          L2: while (true) {
            if (var3 <= var4) {
              var11.n(0);
              var10 = 0;
              var4 = var10;
              L3: while (true) {
                if (var10 >= var3) {
                  return;
                } else {
                  var14_ref = rf.field_eb[var10];
                  var16 = var14_ref;
                  var16 = var14_ref;
                  var14_ref.a(1, -22861, 6, 6, 6);
                  var14_ref.a(22856);
                  var15 = new int[]{var14_ref.field_t + var14_ref.field_P >> -517201119, var14_ref.field_u + var14_ref.field_O >> 522960001, var14_ref.field_k + var14_ref.field_i >> 1678425313};
                  ae.field_a[var10] = var15;
                  var14_ref.a(-var15[2], -var15[0], -var15[1], (byte) -127);
                  var10++;
                  continue L3;
                }
              }
            } else {
              rf.field_eb[var4] = nb.a(param1, var9);
              var4++;
              continue L2;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_V = null;
        field_Q = null;
        int var1 = 81 / ((47 - param0) / 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "You are not currently logged in to the<nbsp>game.";
        field_V = "Type your email address again to make sure it's correct";
    }
}
