/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends sj {
    private boolean field_sb;
    private String field_jb;
    private uc field_ub;
    private String field_ib;
    static rj field_ob;
    static String field_mb;
    static String field_rb;
    static String field_nb;
    static int field_kb;
    static String field_lb;
    static String field_qb;
    private boolean field_pb;
    static volatile int field_tb;

    final static int c(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        var3 = 0;
        if (param1 == 2113632) {
          var4 = en.field_c;
          L0: while (true) {
            if (uc.field_K.length > var3) {
              var5 = dd.field_A[var3];
              if ((var5 ^ -1) > -1) {
                var4 = var4 + gb.field_a;
                var3++;
                var3++;
                continue L0;
              } else {
                var6 = rb.a((byte) 120, true, uc.field_K[var3]);
                var7 = -(var6 >> 1870376513) + tm.field_e;
                var4 = var4 + lc.field_j;
                if (!ec.a(var4, (i.field_o << 147633985) + cd.field_e, param2, (an.field_w << 1877392545) + var6, -an.field_w + var7, param0, param1 + -2113557)) {
                  var4 = var4 + (cd.field_e + (lc.field_j + (i.field_o << 1436872833)));
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return var5;
                }
              }
            } else {
              return -1;
            }
          }
        } else {
          field_tb = -43;
          var4 = en.field_c;
          if (uc.field_K.length > var3) {
            var5 = dd.field_A[var3];
            if ((var5 ^ -1) <= -1) {
              var6 = rb.a((byte) 120, true, uc.field_K[var3]);
              var7 = -(var6 >> 1870376513) + tm.field_e;
              var4 = var4 + lc.field_j;
              if (ec.a(var4, (i.field_o << 147633985) + cd.field_e, param2, (an.field_w << 1877392545) + var6, -an.field_w + var7, param0, param1 + -2113557)) {
                return var5;
              } else {
                var4 = var4 + (cd.field_e + (lc.field_j + (i.field_o << 1436872833)));
                var3++;
                var3++;
                var3++;
                var3++;
                return -1;
              }
            } else {
              var4 = var4 + gb.field_a;
              var3++;
              var3++;
              var3++;
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    public static void i(byte param0) {
        if (param0 > -44) {
          field_rb = null;
          field_lb = null;
          field_mb = null;
          field_rb = null;
          field_qb = null;
          field_ob = null;
          field_nb = null;
          return;
        } else {
          field_lb = null;
          field_mb = null;
          field_rb = null;
          field_qb = null;
          field_ob = null;
          field_nb = null;
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        hc.field_f.c(((wi) this).field_jb, param1 + (((wi) this).field_x >> -1854281727), param0 - -103, 16777215, -1);
        if (!(null == ((wi) this).field_ib)) {
            gf.b(20 + param1, 120 + (param0 - 7), 260, 8421504);
            int discarded$0 = hc.field_f.a(((wi) this).field_ib, param1 + 20, param0 + 128, 260, 100, 16777215, -1, 1, 0, hc.field_f.field_H);
        }
    }

    final void j(byte param0) {
        if (param0 != -115) {
          wi.i((byte) 54);
          ((wi) this).field_pb = true;
          ((wi) this).field_ub.field_R = false;
          return;
        } else {
          ((wi) this).field_pb = true;
          ((wi) this).field_ub.field_R = false;
          return;
        }
    }

    wi(ji param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((wi) this).field_ib = param1;
        if (((wi) this).field_ib != null) {
            var3 = hc.field_f.a(((wi) this).field_ib, 260, hc.field_f.field_H);
            ((wi) this).b(120, 150 + var3, 300);
        }
        ((wi) this).field_ub = new uc(13, 50, 274, 30, 15, 2113632, 4210752);
        ((wi) this).field_pb = false;
        ((wi) this).field_sb = false;
        ((wi) this).field_ub.field_R = true;
        ((wi) this).b((byte) -84, (lm) (Object) ((wi) this).field_ub);
    }

    final void a(boolean param0, String param1, float param2, byte param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
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
          if (((wi) this).field_sb) {
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
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param0) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L2;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L2;
            }
          }
          ((wi) this).field_sb = stackIn_11_1 != 0;
          if (!((wi) this).field_sb) {
            ((wi) this).field_ub.b(4210752, (byte) 94, 2113632);
            if (!((wi) this).field_pb) {
              ((wi) this).field_jb = param1;
              ((wi) this).field_ub.field_S = (int)(param2 / 100.0f * 65536.0f);
              var5 = 95 % ((0 - param3) / 38);
              return;
            } else {
              ((wi) this).field_ub.field_R = false;
              ((wi) this).field_jb = param1;
              ((wi) this).field_ub.field_S = (int)(param2 / 100.0f * 65536.0f);
              var5 = 95 % ((0 - param3) / 38);
              return;
            }
          } else {
            ((wi) this).field_ub.b(4210752, (byte) 94, 8405024);
            ((wi) this).field_ub.field_R = true;
            ((wi) this).field_jb = param1;
            ((wi) this).field_ub.field_S = (int)(param2 / 100.0f * 65536.0f);
            var5 = 95 % ((0 - param3) / 38);
            return;
          }
        } else {
          ((wi) this).field_jb = param1;
          ((wi) this).field_ub.field_S = (int)(param2 / 100.0f * 65536.0f);
          var5 = 95 % ((0 - param3) / 38);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = "Entrance";
        field_nb = "Ability used";
        field_rb = "Giant Snake";
        field_lb = "A humanoid construct made of stone; its one instruction is to crush the bodies of any raiders that cross its path.<br><br>This monster requires 2 successful strikes from the same raider to defeat.";
        field_qb = "You successfully stole <%0> gold!";
        field_tb = -1;
    }
}
